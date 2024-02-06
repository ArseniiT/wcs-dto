package com.wcs.dto.entity;

import jakarta.persistence.*;


@Entity
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int power;

    @Enumerated(EnumType.STRING)
    private Attribute attribute;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Pokemon() {
    }

    public Pokemon(String name, int power, Attribute attribute) {
        this.name = name;
        this.power = power;
        this.attribute = attribute;
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

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
