package com.example;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.annotation.TypeDef;
import io.micronaut.data.model.DataType;

@MappedEntity
public class Ent {
    @Id
    @GeneratedValue
    Long     id;
    @TypeDef(type = DataType.STRING_ARRAY)
    String[] strings;

    public Ent(Long id, String[] strings) {
        this.id      = id;
        this.strings = strings;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String[] getStrings() {
        return strings;
    }

    public void setStrings(String[] strings) {
        this.strings = strings;
    }
}
