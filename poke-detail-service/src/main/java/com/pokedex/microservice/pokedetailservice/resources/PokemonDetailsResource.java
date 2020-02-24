package com.pokedex.microservice.pokedetailservice.resources;

import com.pokedex.microservice.pokedetailservice.dummy.database.PokemonDetailsDummyDAO;
import com.pokedex.microservice.pokedetailservice.model.PokemonDetails;
import com.pokedex.microservice.pokedetailservice.model.exceptions.PokemonNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/details")
public class PokemonDetailsResource {

    @Autowired
    private PokemonDetailsDummyDAO pokemonDetailsDAO;

    @GetMapping("/getDetails/{name}")
    public PokemonDetails getPokemonDetails(@PathVariable String name) {
        PokemonDetails pokemon = pokemonDetailsDAO.findByName(name);

        if(pokemon == null)
            throw new PokemonNotFoundException("Pokemon with name - " + name + " not found!");

        return pokemon;
    }

}
