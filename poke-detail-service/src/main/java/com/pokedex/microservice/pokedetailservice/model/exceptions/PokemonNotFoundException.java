package com.pokedex.microservice.pokedetailservice.model.exceptions;

public class PokemonNotFoundException extends RuntimeException {

    public PokemonNotFoundException(String message) {
        super(message);
    }

}
