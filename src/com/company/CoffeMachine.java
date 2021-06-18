package com.company;

import java.util.ArrayList;

public class CoffeMachine {
    private ArrayList<Cofffe> coffeeList = new ArrayList<>();

    public CoffeMachine() {
        // constructorda kahve listesine kahveleri ekleyelim kahve listemiz daha sonra değişmeyecek
        addAllCoffees();
    }

    public ArrayList<Cofffe> getCoffeeList() {
        return coffeeList;
    }

    private void addAllCoffees() {
        coffeeList.add(new Cofffe("Espresso", 7));
        coffeeList.add(new Cofffe("Double Espresso", 12));
        coffeeList.add(new Cofffe("Cappuccino", 12));
        coffeeList.add(new Cofffe("Caffe Latte", 12));
        coffeeList.add(new Cofffe("Mocha", 13));
        coffeeList.add(new Cofffe("Americano", 10));
        coffeeList.add(new Cofffe("Hot Water", 3));
    }

}



