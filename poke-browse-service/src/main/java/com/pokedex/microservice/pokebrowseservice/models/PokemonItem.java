package com.pokedex.microservice.pokebrowseservice.models;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel(description = "Model for a pokemon item abstraction.")
public class PokemonItem {

    @ApiModelProperty(value = "Pokemon name", required = true, example = "Pikachu, Charmander")
    private String name;

    @ApiModelProperty(value = "Pokemon types")
    private List<String> types;

    @ApiModelProperty(value = "Pokemon image URL")
    private String imgURL;

    @ApiModelProperty(value = "Boolean value for favorite option.")
    private boolean favorite;

    public PokemonItem(String name, List<String> types, String imgURL, boolean favorite) {
        this.name = name;
        this.types = types;
        this.imgURL = imgURL;
        this.favorite = favorite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

}
