package com.wcs.dto.mapper;

import com.wcs.dto.dto.PokemonDTO;
import com.wcs.dto.entity.Pokemon;

import java.util.List;
import java.util.stream.Collectors;

public class PokemonMapper {
    public static PokemonDTO toDTO(Pokemon pokemon) {
        PokemonDTO pokemonDTO = new PokemonDTO();
        pokemonDTO.setName(pokemon.getName());
        pokemonDTO.setAttribute(pokemon.getAttribute());
        return pokemonDTO;
    }

    public static List<PokemonDTO> toDTOList(List<Pokemon> pokemons) {
        return pokemons.stream()
                .map(PokemonMapper::toDTO)
                .collect(Collectors.toList());
    }
}

