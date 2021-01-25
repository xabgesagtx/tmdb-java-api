package com.github.xabgesagtx.tmdb.codegen.model;

import lombok.Value;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Value
public class ObjectType implements ClassType {

    String name;
    List<Field> fields;

    public List<ObjectType> getObjectTypes() {
        return fields.stream()
                .map(Field::getType)
                .flatMap(this::toObjectType)
                .collect(Collectors.toList());
    }

    private Stream<ObjectType> toObjectType(Type type) {
        if (type instanceof ArrayType) {
            ArrayType arrayType = (ArrayType) type;
            if (arrayType.getType() instanceof ObjectType) {
                return Stream.of((ObjectType) arrayType.getType());
            }
        } else if (type instanceof ObjectType) {
            return Stream.of((ObjectType) type);
        }
        return Stream.empty();
    }

    public List<EnumType> getEnumTypes() {
        return fields.stream()
                .map(Field::getType)
                .filter(EnumType.class::isInstance)
                .map(EnumType.class::cast)
                .collect(Collectors.toList());
    }

}
