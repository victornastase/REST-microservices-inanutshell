package com.pokedex.microservice.pokecatalogservice.resources;

import com.pokedex.microservice.pokecatalogservice.models.PokemonDetails;
import com.pokedex.microservice.pokecatalogservice.models.PokemonList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/catalog")
public class CatalogResource {

    @Autowired
    private WebClient.Builder webClient;

    @Autowired
    private RestTemplate restTemplateClient;

    @GetMapping("/pokemons")
    public PokemonList getPokemonList() {
        return webClient.build()
                        .get().uri("http://localhost:8081/browse/pokemonList")
                        .retrieve().bodyToMono(PokemonList.class)
                        .block();

        //return restTemplateClient.getForObject("http://localhost:8081/browse/pokemonList", PokemonList.class);
    }

    @GetMapping("/details/{name}")
    public PokemonDetails getPokemonDetails(@PathVariable String name) {
        return webClient.build()
                .get().uri("http://localhost:8082/details/getDetails/" + name)
                .retrieve().bodyToMono(PokemonDetails.class)
                .block();

        //return restTemplateClient.getForObject("http://localhost:8082/details/getDetails/" + name, PokemonDetails.class);
    }

}
