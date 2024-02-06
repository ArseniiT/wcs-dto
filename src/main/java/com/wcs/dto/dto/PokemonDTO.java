package com.wcs.dto.dto;

import com.wcs.dto.entity.Attribute;

public class PokemonDTO {
    private String name;
    private Attribute attribute;

    public PokemonDTO() {
    }

    public PokemonDTO(String name, Attribute attribute) {
        this.name = name;
        this.attribute = attribute;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }
}

