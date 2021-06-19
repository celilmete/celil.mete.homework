package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeTest {
    private Coffee coffee;
    private final String name = "Americano";
    private final int price = 12;
    @BeforeEach
    void setUp() {
        coffee = new Coffee(name, price);
        coffee.addIngredient("Espresso", 1).addIngredient("Hot Water", 4);
    }

    @Test
    void getPrice() {
        assertEquals(price, coffee.getPrice());
    }

    @Test
    void getName() {
        assertEquals(name, coffee.getName());
    }

    @Test
    void addIngredient() {
        HashMap<String, Integer> ingredients = new HashMap<>();
        ingredients.put("Espresso", 1);ingredients.put("Hot Water", 4);
        assertEquals(ingredients,coffee.getRecipe());
    }
}