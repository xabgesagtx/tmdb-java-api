package com.github.xabgesagtx.tmdb.api;

import com.github.xabgesagtx.tmdb.api.external.ComplexTypeSpec;
import com.github.xabgesagtx.tmdb.codegen.model.*;
import com.google.common.base.CaseFormat;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
public class SpecToTypeConverter {

    private final RefTypeResolver refTypeResolver;

    public SpecToTypeConverter(RefTypeResolver refTypeResolver) {
        this.refTypeResolver = refTypeResolver;
    }

    public Type generateType(String name, ComplexTypeSpec spec) {
        log.info("Generating type for: " + name);
        return createType(name, spec);
    }

    private List<Field> createFields(ComplexTypeSpec spec) {
        // workaround for get trending
        if (spec.getProperties().containsKey("") && spec.getProperties().containsKey("page")) {
            renameEmptyKey(spec.getProperties(), "results");
        // workaround for credits
        } else if (spec.getProperties().containsKey("") && spec.getProperties().containsKey("character")) {
            renameEmptyKey(spec.getProperties(), "profile_path");
        } else if (spec.getProperties().containsKey("")) {
            throw new IllegalArgumentException("Unclean spec " + spec);
        }
        return spec.getProperties().entrySet().stream()
                .map(entry -> createField(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());
    }

    private void renameEmptyKey(Map<String, ComplexTypeSpec> properties, String newName) {
        properties.put(newName, properties.get(""));
        properties.remove("");
    }

    private Field createField(String originalName, ComplexTypeSpec spec) {
        String name;
        if (originalName.startsWith("_")) {
            name = "_" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, originalName.substring(1));
        } else {
            name = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, originalName);
        }
        name = StringUtils.replace(name, ".", "_");
        Type type = createType(originalName, spec);
        return new Field(type, name, originalName);
    }

    private Type createType(String originalName, ComplexTypeSpec spec) {
        if (spec.getRef() != null) {
            ComplexTypeSpec resolvedSpec = refTypeResolver.resolveRefs(spec);
            if (resolvedSpec == null) {
                return new SimpleType(SimpleType.Primitive.STRING);
            } else {
                return createType(originalName, resolvedSpec);
            }
        } else if (spec.getType() == null) {
            log.warn("Something weird happened for " + originalName + " - no type information available: " + spec);
            // TODO: Better support for this - maybe merge both types
            return new MapType();
        } else if (spec.getType().contains("object") && spec.getProperties() == null) {
            // really nothing to know about the fields otherwise
            return new MapType();
        } else if (spec.getType().contains("object")) {
            return createObjectType(originalName, spec);
        } else if (spec.getType().contains("array")) {
            return createArrayType(originalName, spec);
        } else if (spec.getType().contains("string") && spec.getEnumValues() != null) {
            return createEnumType(originalName, spec);
        } else if (spec.getType().contains("string") && "date".equals(spec.getFormat())) {
            return new SimpleType(SimpleType.Primitive.DATE);
        } else if (spec.getType().contains("string")) {
            return new SimpleType(SimpleType.Primitive.STRING);
        } else if (spec.getType().contains("integer")) {
            return new SimpleType(SimpleType.Primitive.INTEGER);
        } else if (spec.getType().contains("number")) {
            return new SimpleType(SimpleType.Primitive.FLOAT);
        } else if (spec.getType().contains("boolean")) {
            return new SimpleType(SimpleType.Primitive.BOOLEAN);
        } else {
            log.warn("Unknown case: (" + originalName + ") " + spec);
            if (originalName.endsWith("path") || originalName.equals("iso_639_1") || originalName.equals("production_code")) {
                return new SimpleType(SimpleType.Primitive.STRING);
            } else if (originalName.equals("belongs_to_collection")) {
                return new MapType();
            } else if (originalName.equals("next_episode_to_air")) {
                return new MapType();
            } else {
                throw new IllegalArgumentException("Unknown case: (" + originalName + ") " + spec);
            }
        }
    }

    private Type createEnumType(String originalName, ComplexTypeSpec spec) {
        String name = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, originalName);
        List<String> enumValues = spec.getEnumValues().stream().filter(StringUtils::isNotBlank).collect(Collectors.toList());
        return new EnumType(name, enumValues);
    }

    private ArrayType createArrayType(String originalName, ComplexTypeSpec spec) {
        Type objectType = createType(originalName, spec.getItems());
        return new ArrayType(objectType);
    }

    private ObjectType createObjectType(String originalName, ComplexTypeSpec spec) {
        String name = getClassName(originalName);
        List<Field> fields = createFields(spec);
        return new ObjectType(name, fields);
    }

    private String getClassName(String originalName) {
        String name = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, originalName);
        if (name.endsWith("ies")) {
            return name.substring(0, name.length() - 3) + "y";
        } else if (name.endsWith("s")) {
            return name.substring(0, name.length() - 1);
        } else {
            return name;
        }
    }

}
