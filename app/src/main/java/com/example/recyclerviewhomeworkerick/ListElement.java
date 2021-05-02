package com.example.recyclerviewhomeworkerick;

import java.io.Serializable;

public class ListElement implements Serializable {
    private String name;
    private String description;
    private String image;
    private String ingredients;
    private String preparation;

    public ListElement(String name, String description, String image, String ingredients, String preparation) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.ingredients = ingredients;
        this.preparation = preparation;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getPreparation() {
        return preparation;
    }
}
