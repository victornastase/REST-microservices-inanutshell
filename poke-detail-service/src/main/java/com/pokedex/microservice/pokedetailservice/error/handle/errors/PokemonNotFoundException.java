package com.pokedex.microservice.pokedetailservice.error.handle.errors;

public class PokemonNotFoundException extends RuntimeException {

    public PokemonNotFoundException(String message) {
        super(message);
    }

}
