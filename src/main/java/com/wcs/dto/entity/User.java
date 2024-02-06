package com.wcs.dto.entity;

import jakarta.persistence.*;
import java.util.List;


@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private int level;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Pokemon> pokemons;

    public User() {
    }

    public User(String name, int age, int level, List<Pokemon> pokemons) {
        this.name = name;
        this.age = age;
        this.level = level;
        this.pokemons = pokemons;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
}

