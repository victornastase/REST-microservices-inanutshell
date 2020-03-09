package com.pokedex.microservice.pokebrowseservice.models;

import java.util.List;

public class PokemonItem {

    private String name;
    private List<String> types;
    private String imgURL;
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
