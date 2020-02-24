package com.pokedex.microservice.pokebrowseservice.dummy.database;

import com.pokedex.microservice.pokebrowseservice.model.PokemonItem;
import com.pokedex.microservice.pokebrowseservice.model.PokemonList;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class DummyPokemonListDAO {

    private PokemonList pokemonListObject;

    private List<PokemonItem> pokemonItems = Arrays.asList(
            new PokemonItem("Bulbasaur", Arrays.asList("Grass", "Poison"),
                    "https://img.pokemondb.net/artwork/large/bulbasaur.jpg", false),
            new PokemonItem("Charmander", Arrays.asList("Fire" ),
                    "https://img.pokemondb.net/artwork/large/charmander.jpg", false),
            new PokemonItem("Wartortle", Arrays.asList("Water" ),
                    "https://img.pokemondb.net/artwork/large/wartortle.jpg", false),
            new PokemonItem("Metapod", Arrays.asList("Bug" ),
                    "https://img.pokemondb.net/artwork/large/metapod.jpg", true),
            new PokemonItem("Rattata", Arrays.asList("Normal" ),
                    "https://img.pokemondb.net/artwork/large/rattata.jpg", false)
    );

    public DummyPokemonListDAO() {
        this.pokemonListObject = new PokemonList();
        this.pokemonListObject.setPokemonList(pokemonItems);
    }


    public PokemonList readAll() {
        return this.pokemonListObject;
    }

    public PokemonList getFavorites() {
        List<PokemonItem> favList = pokemonItems.stream()
                                                .filter(pokemonItem -> pokemonItem.isFavorite())
                                                .collect(Collectors.toList());
        return new PokemonList(favList);
    }

}
