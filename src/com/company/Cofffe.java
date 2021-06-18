package com.company;

import java.util.HashMap;

public class Cofffe {
    private int price;
    private String name;
    private HashMap<String, Integer> recipe = new HashMap<>(); // kahvenin tarifi

    public Cofffe(String isim, int fiyat) {
        this.name = isim;
        this.price = fiyat;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }



}
