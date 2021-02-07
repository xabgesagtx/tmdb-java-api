package com.github.xabgesagtx.tmdb.codegen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.xabgesagtx.tmdb.codegen.model.*;
import com.github.xabgesagtx.tmdb.codegen.model.ClassType;
import com.sun.codemodel.*;
import lombok.Builder;
import lombok.SneakyThrows;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ModelGenerator extends AbstractGenerator {

    private final JCodeModel model;

    public ModelGenerator(JCodeModel model) {
        this.model = model;
    }

    @SneakyThrows
    JDefinedClass createClass(ObjectType baseType, JClassContainer classContainer, boolean shouldBeStatic) {
        int mod = shouldBeStatic ? JMod.PUBLIC | JMod.STATIC : JMod.PUBLIC;
        JDefinedClass clazz = classContainer._class(mod, baseType.getName());
        clazz.annotate(Value.class);
        clazz.annotate(Builder.class);
        clazz.annotate(Jacksonized.class);
        clazz.annotate(JsonIgnoreProperties.class).param("ignoreUnknown", true);
        List<JDefinedClass> enums = createEnums(baseType.getEnumTypes(), clazz);
        List<JDefinedClass> innerClasses = createInnerClasses(baseType.getObjectTypes(), clazz);
        Map<String, JDefinedClass> typeMap = createTypeMap(enums, innerClasses);
        baseType.getFields().forEach(field -> addField(clazz, field, typeMap));
        return clazz;
    }

    private void addField(JDefinedClass clazz, Field field, Map<String, JDefinedClass> typeMap) {
        Type type = field.getType();
        JFieldVar fieldVar;
        if (type instanceof SimpleType) {
            fieldVar = createField(clazz, field, (SimpleType) type);
        } else if (type instanceof MapType) {
            fieldVar = createMapField(clazz, field);
        } else if (type instanceof ClassType) {
            fieldVar = createField(clazz, field, typeMap, (ClassType) type);
        } else if (type instanceof ArrayType) {
            fieldVar = createField(clazz, field, typeMap, (ArrayType) type);
        } else {
            throw new IllegalArgumentException("Unsupported type " + type.getClass().getName());
        }
        fieldVar.annotate(JsonProperty.class).param("value", field.getJsonName());
    }

    private JFieldVar createField(JDefinedClass clazz, Field field, Map<String, JDefinedClass> typeMap, ArrayType type) {
        JFieldVar fieldVar;
        if (type.getType() instanceof SimpleType) {
            Class<?> fieldClass = getClassForSimpleType((SimpleType) type.getType());
            JClass wrapperClass = model.ref(List.class).narrow(fieldClass);
            fieldVar = clazz.field(JMod.NONE, wrapperClass, field.getName());
        } else if (type.getType() instanceof ClassType) {
            JDefinedClass fieldClass = typeMap.get(((ClassType) type.getType()).getName());
            JClass wrapperClass = model.ref(List.class).narrow(fieldClass);
            fieldVar = clazz.field(JMod.NONE, wrapperClass, field.getName());
        } else if (type.getType() instanceof MapType) {
            JClass wrapperClass = model.ref(Map.class).narrow(String.class, Object.class);
            fieldVar = clazz.field(JMod.NONE, wrapperClass, field.getName());
        } else {
            throw new IllegalArgumentException("Unsupported type " + type.getType().getClass().getName());
        } return fieldVar;
    }

    private JFieldVar createMapField(JDefinedClass clazz, Field field) {
        JClass fieldClass = model.ref(Map.class).narrow(String.class, Object.class);
        return clazz.field(JMod.NONE, fieldClass, field.getName());
    }

    private JFieldVar createField(JDefinedClass clazz, Field field, Map<String, JDefinedClass> typeMap, ClassType type) {
        JDefinedClass fieldClass = typeMap.get(type.getName());
        return clazz.field(JMod.NONE, fieldClass, field.getName());
    }

    private JFieldVar createField(JDefinedClass clazz, Field field, SimpleType type) {
        Class<?> fieldClass = getClassForSimpleType(type);
        return clazz.field(JMod.NONE, fieldClass, field.getName());
    }

    private Map<String, JDefinedClass> createTypeMap(List<JDefinedClass> enums, List<JDefinedClass> innerClasses) {
        List<JDefinedClass> jointClasses = new ArrayList<>(enums);
        jointClasses.addAll(innerClasses);
        return jointClasses.stream().collect(Collectors.toMap(JDefinedClass::name, Function.identity()));
    }

    private List<JDefinedClass> createInnerClasses(List<ObjectType> objectTypes, JClassContainer clazz) {
        return objectTypes.stream()
                .map(type -> createClass(type, clazz, true))
                .collect(Collectors.toList());
    }

    private List<JDefinedClass> createEnums(List<EnumType> enumTypes, JClassContainer classContainer) {
        return enumTypes.stream()
                .map(type -> createEnum(type, classContainer))
                .collect(Collectors.toList());
    }

    @SneakyThrows
    JDefinedClass createEnum(EnumType enumType, JClassContainer classContainer) {
        JDefinedClass clazz = classContainer._enum(enumType.getName());
        JFieldVar valueField = clazz.field(JMod.PRIVATE | JMod.FINAL, String.class, "value");
        JMethod constructor = clazz.constructor(JMod.NONE);
        JVar valueParam = constructor.param(String.class, "value");
        constructor.body().assign(JExpr._this().ref(valueField), valueParam);
        JMethod toStringMethod = clazz.method(JMod.PUBLIC, String.class, "toString");
        toStringMethod.annotate(Override.class);
        toStringMethod.body()._return(valueField);
        enumType.getValues().forEach(name -> {
            String enumName = name.replaceAll("\\s", "_").replaceAll("\\.", "").toUpperCase();
            JEnumConstant enumConstant = clazz.enumConstant(enumName).arg(JExpr.lit(name));
            enumConstant.annotate(JsonProperty.class).param("value", name);
        });
        return clazz;
    }

}
