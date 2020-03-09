package com.pokedex.microservice.pokedetailservice.dummy.database;

import com.pokedex.microservice.pokedetailservice.models.PokemonDetails;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class PokemonDetailsDummyDAO {

    private List<PokemonDetails> pokemonDetailsList = Arrays.asList(
            new PokemonDetails("Bulbasaur", Arrays.asList("Grass", "Poison"),
                    "https://img.pokemondb.net/artwork/large/bulbasaur.jpg", false, 951, 1071,
                    "6.76kg", "7.89kg", "0.61m", "0.79m"),
            new PokemonDetails("Charmander", Arrays.asList("Fire"),
                    "https://img.pokemondb.net/artwork/large/charmander.jpg", false, 1087, 1371,
                    "9.76kg", "11.50kg", "0.91m", "1.79m"),
            new PokemonDetails("Wartortle", Arrays.asList("Fire"),
                    "https://img.pokemondb.net/artwork/large/wartortle.jpg", false, 1187, 2371,
                    "10.82kg", "20.46kg", "1.91m", "2.11m"),
            new PokemonDetails("Metapod", Arrays.asList("Fire"),
                    "https://img.pokemondb.net/artwork/large/metapod.jpg", false, 1421, 1701,
                    "1.82kg", "2.46kg", "0.91m", "1.11m"),
            new PokemonDetails("Metapod", Arrays.asList("Fire"),
                    "https://img.pokemondb.net/artwork/large/metapod.jpg", false, 1421, 1701,
                    "1.82kg", "2.46kg", "0.91m", "1.11m")
    );

    public PokemonDetails findByName(String name) {
        return pokemonDetailsList.stream()
                .filter(pokemonDetails -> name.equals(pokemonDetails.getName()))
                .findAny()
                .orElse(null);
    }

}
