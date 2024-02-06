package com.wcs.dto.dto;

import java.util.List;

public class UserDTO {
    private String name;
    private List<PokemonDTO> pokemons;

    public UserDTO() {
    }

    public UserDTO(String name, List<PokemonDTO> pokemons) {
        this.name = name;
        this.pokemons = pokemons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PokemonDTO> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<PokemonDTO> pokemons) {
        this.pokemons = pokemons;
    }
}
