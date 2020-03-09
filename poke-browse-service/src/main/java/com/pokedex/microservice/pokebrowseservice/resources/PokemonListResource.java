package com.pokedex.microservice.pokebrowseservice.resources;

import com.pokedex.microservice.pokebrowseservice.dummy.database.DummyPokemonListDAO;
import com.pokedex.microservice.pokebrowseservice.models.PokemonList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/browse")
public class PokemonListResource {

    @Autowired
    private DummyPokemonListDAO pokemonDAO;

    @GetMapping("/pokemonList")
    //@RequestMapping(method = RequestMethod.GET, path = "/pokemonList")
    public PokemonList getPokemonList() {
        return pokemonDAO.readAll();
    }

    @GetMapping("/favorites")
    public PokemonList getFavorites() {
        return pokemonDAO.getFavorites();
    }

}
