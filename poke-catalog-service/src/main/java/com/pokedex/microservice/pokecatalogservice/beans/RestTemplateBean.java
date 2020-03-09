package com.pokedex.microservice.pokecatalogservice.beans;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateBean {

    @Bean
    public RestTemplate defineClient(RestTemplateBuilder builder) {
        return builder.build();
    }

}
