package com.travelagency.model;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class StringTrimConverter implements AttributeConverter<String, String> {

    /**
     * Converts the value stored in the entity attribute into the data
     * representation to be stored in the database.
     **/

    @Override
    public String convertToDatabaseColumn(String value) {
        if (value != null) {
            if (value.trim().length() > 0) {
                return value.trim();
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    @Override
    public String convertToEntityAttribute(String value) {
        if (value == null) {
            return null;
        }
        return value.trim();
    }

}
