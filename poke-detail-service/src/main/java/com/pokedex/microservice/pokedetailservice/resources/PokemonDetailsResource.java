package com.pokedex.microservice.pokedetailservice.resources;

import com.pokedex.microservice.pokedetailservice.dummy.database.PokemonDetailsDummyDAO;
import com.pokedex.microservice.pokedetailservice.models.PokemonDetails;
import com.pokedex.microservice.pokedetailservice.error.handle.errors.PokemonNotFoundException;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "Pokemon details REST resource.")
@RestController
@RequestMapping("/details")
public class PokemonDetailsResource {

    @Autowired
    private PokemonDetailsDummyDAO pokemonDetailsDAO;

    @ApiOperation(value = "Get pokemon details using name", response = PokemonDetails.class)
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "Something went wrong | Internal Server Error"),
            @ApiResponse(code = 404, message = "Pokemon not found!")
    })
    @GetMapping("/getDetails/{name}")
    public PokemonDetails getPokemonDetails(    @PathVariable
                                                @ApiParam(name = "pokemonName", value = "Pokemon Name", required = true)
                                                            String name) {
        PokemonDetails pokemon = pokemonDetailsDAO.findByName(name);

        if(pokemon == null)
            throw new PokemonNotFoundException("Pokemon with name - " + name + " not found!");

        return pokemon;
    }

}
