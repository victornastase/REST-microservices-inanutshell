package com.pokedex.microservice.pokecatalogservice.resources;

import com.pokedex.microservice.pokecatalogservice.models.PokemonDetails;
import com.pokedex.microservice.pokecatalogservice.models.PokemonList;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Api(value = "Pokemon Catalog REST resource.")
@RestController
@RequestMapping("/catalog")
public class CatalogResource {

    @Autowired
    private WebClient.Builder webClient;

    @Autowired
    private RestTemplate restTemplateClient;

    @ApiOperation(value = "Get pokemon list", response = PokemonList.class)
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "Something went wrong | Internal Server Error")
    })
    @GetMapping("/pokemons")
    public PokemonList getPokemonList() {
        return webClient.build()
                        .get().uri("http://localhost:8081/browse/pokemonList")
                        .retrieve().bodyToMono(PokemonList.class)
                        .block();

        //return restTemplateClient.getForObject("http://localhost:8081/browse/pokemonList", PokemonList.class);
    }

    @ApiOperation(value = "Get pokemon details using name", response = PokemonDetails.class)
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "Something went wrong | Internal Server Error"),
            @ApiResponse(code = 404, message = "Pokemon not found!")
    })
    @GetMapping("/details/{name}")
    public PokemonDetails getPokemonDetails(@PathVariable String name) {
        return webClient.build()
                .get().uri("http://localhost:8082/details/getDetails/" + name)
                .retrieve().bodyToMono(PokemonDetails.class)
                .block();

        //return restTemplateClient.getForObject("http://localhost:8082/details/getDetails/" + name, PokemonDetails.class);
    }

}
