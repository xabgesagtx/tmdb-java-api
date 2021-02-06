package com.github.xabgesagtx.tmdb.codegen;

import com.github.xabgesagtx.tmdb.codegen.model.SimpleType;

import java.time.LocalDate;

abstract class AbstractGenerator {

    Class<?> getClassForSimpleType(SimpleType type) {
        return getClassForPrimitive(type.getPrimitive());
    }

    Class<?> getClassForPrimitive(SimpleType.Primitive type) {
        switch (type) {
            case BOOLEAN:
                return Boolean.class;
            case DATE:
                return LocalDate.class;
            case FLOAT:
                return Double.class;
            case INTEGER:
                return Integer.class;
            case STRING:
                return String.class;
            default:
                throw new IllegalArgumentException("Unknown primitive " + type);
        }
    }

}
