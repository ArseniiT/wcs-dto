package com.wcs.dto.controller;

import com.wcs.dto.dto.PokemonDTO;
import com.wcs.dto.entity.Pokemon;
import com.wcs.dto.mapper.PokemonMapper;
import com.wcs.dto.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pokemons")
public class PokemonController {

    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping
    public List<PokemonDTO> getAllPokemons() {
        List<Pokemon> pokemons = pokemonService.getAllPokemons();
        return pokemons.stream()
                .map(PokemonMapper::toDTO)
                .collect(Collectors.toList());
    }
}
