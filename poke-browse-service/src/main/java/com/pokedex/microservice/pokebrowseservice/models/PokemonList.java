package com.pokedex.microservice.pokebrowseservice.models;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel(description = "Wrapper model for pokemon list.")
public class PokemonList {

    @ApiModelProperty(value = "Wrapper list for pokemon items.")
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
