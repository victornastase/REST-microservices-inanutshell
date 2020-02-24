package com.pokedex.microservice.pokedetailservice.model;

import java.util.List;

public class PokemonDetails {

    private String name;
    private List<String> types;
    private String imgURL;
    private boolean favorite;
    private int CP;
    private int HP;
    private String minHeight;
    private String maxHeight;
    private String minWeight;
    private String maxWeight;

    public PokemonDetails(String name, List<String> types, String imgURL, boolean favorite, int CP, int HP,
                          String minHeight, String maxHeight, String minWeight, String maxWeight) {
        this.name = name;
        this.types = types;
        this.imgURL = imgURL;
        this.favorite = favorite;
        this.CP = CP;
        this.HP = HP;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
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

    public int getCP() {
        return CP;
    }

    public void setCP(int CP) {
        this.CP = CP;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public String getMinHeight() {
        return minHeight;
    }

    public void setMinHeight(String minHeight) {
        this.minHeight = minHeight;
    }

    public String getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(String maxHeight) {
        this.maxHeight = maxHeight;
    }

    public String getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(String minWeight) {
        this.minWeight = minWeight;
    }

    public String getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(String maxWeight) {
        this.maxWeight = maxWeight;
    }

}
