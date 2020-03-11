package com.pokedex.microservice.pokebrowseservice.resources;

import com.pokedex.microservice.pokebrowseservice.dummy.database.DummyPokemonListDAO;
import com.pokedex.microservice.pokebrowseservice.models.PokemonList;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "Pokemon browse list REST resource.")
@RestController
@RequestMapping("/browse")
public class PokemonListResource {

    @Autowired
    private DummyPokemonListDAO pokemonDAO;

    @ApiOperation(value = "Get pokemon list", response = PokemonList.class)
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "Something went wrong | Internal Server Error")
    })
    @GetMapping("/pokemonList")
    //@RequestMapping(method = RequestMethod.GET, path = "/pokemonList")
    public PokemonList getPokemonList() {
        return pokemonDAO.readAll();
    }

    @ApiOperation(value = "Get favorites pokemon list", response = PokemonList.class)
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "Something went wrong | Internal Server Error")
    })
    @GetMapping("/favorites")
    public PokemonList getFavorites() {
        return pokemonDAO.getFavorites();
    }

}
