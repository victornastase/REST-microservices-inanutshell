package com.pokedex.microservice.pokebrowseservice.models;

import java.util.List;

public class PokemonList {

    private List<PokemonItem> pokemonList;

    public PokemonList() {}

    public PokemonList(List<PokemonItem> pokemonList) {
        this.pokemonList = pokemonList;
    }

    public List<PokemonItem> getPokemonList() {
        return pokemonList;
    }

    public void setPokemonList(List<PokemonItem> pokemonList) {
        this.pokemonList = pokemonList;
    }
}
