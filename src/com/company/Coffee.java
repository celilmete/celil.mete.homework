package com.company;

import java.util.HashMap;

public class Coffee {
    private int price;
    private String name;
    private HashMap<String, Integer> recipe = new HashMap<>(); // kahvenin tarifi

    public Coffee(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Coffee addIngredient(String ingredient, int amount) {
        recipe.put(ingredient, amount);
        return this;
    }

    public HashMap<String, Integer> getRecipe() {
        return recipe;
    }
}
