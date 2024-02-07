package com.wcs.dto.service;

import com.wcs.dto.dto.PokemonDTO;
import com.wcs.dto.entity.Pokemon;
import com.wcs.dto.mapper.PokemonMapper;
import com.wcs.dto.repository.PokemonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PokemonService {

    private final PokemonRepository pokemonRepository;

    public PokemonService(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    public List<Pokemon> getAllPokemons() {
        return pokemonRepository.findAll();
    }

    public PokemonDTO getPokemonById(Long pokemonId) {
        Optional<Pokemon> pokemonOptional = pokemonRepository.findById(pokemonId);
        if (pokemonOptional.isPresent()) {
            Pokemon pokemon = pokemonOptional.get();
            return PokemonMapper.toDTO(pokemon);
        } else {
            throw new RuntimeException("Pokemon not found");
        }
    }

    public List<PokemonDTO> getPokemonByName(String name) {
        List<Pokemon> pokemons = pokemonRepository.findByName(name);
        return pokemons.stream()
                .map(PokemonMapper::toDTO)
                .collect(Collectors.toList());
    }

    public PokemonDTO addPokemon(Pokemon pokemon) {
        pokemonRepository.save(pokemon);
        return PokemonMapper.toDTO(pokemon);
    }
}
