package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeMachine {
    private final ArrayList<Coffee> coffeeList = new ArrayList<>();

    public CoffeeMachine() {
        // constructorda kahve listesine kahveleri ekleyelim kahve listemiz daha sonra değişmeyecek
        addAllCoffees();
    }

    public ArrayList<Coffee> getCoffeeList() {
        return coffeeList;
    }

    private void addAllCoffees() {
        coffeeList.add(new Coffee("Espresso", 7));
        coffeeList.add(new Coffee("Double Espresso", 12));
        coffeeList.add(new Coffee("Cappuccino", 12));
        coffeeList.add(new Coffee("Caffe Latte", 12));
        coffeeList.add(new Coffee("Mocha", 13));
        coffeeList.add(new Coffee("Americano", 10));
        coffeeList.add(new Coffee("Hot Water", 3));
    }

    public void chooseCoffee() {
        int iter = 1;
        for (Coffee coffee:coffeeList) {
            System.out.println(iter + ". " + coffee.getName() + " (" + coffee.getPrice() + "tl)"); // bütün seçenekleri yazdır
            iter++;
        }
        System.out.println("Lütfen içmek istediğiniz kahvenin numarasını giriniz.");
        int coffeeNumber = new Scanner(System.in).nextInt() - 1;
    }

    private void prepareCoffee() {

    }

}



