package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class CoffeeMachine {
    private final ArrayList<Coffee> coffeeList = new ArrayList<>();

    public CoffeeMachine() {
        // constructorda kahve listesine kahveleri ekleyelim kahve listemiz daha sonra değişmeyecek
        addAllCoffees();
    }

    private void addAllCoffees() {
        coffeeList.add(new Coffee("Espresso", 7).addIngredient("Espresso", 1));
        coffeeList.add(new Coffee("Double Espresso", 12).addIngredient("Espresso", 2));
        coffeeList.add(new Coffee("Cappuccino", 12).addIngredient("Espresso", 1).
                addIngredient("Steamed Milk", 2).addIngredient("Milk Foam", 2));
        coffeeList.add(new Coffee("Caffe Latte", 12).addIngredient("Espresso", 1).
                addIngredient("Steamed Milk", 3).addIngredient("Milk Foam", 1));
        coffeeList.add(new Coffee("Mocha", 13).addIngredient("Espresso", 1).
                addIngredient("Steamed Milk", 1).addIngredient("Milk Foam", 1).
                addIngredient("Hot Chocolate", 2));
        coffeeList.add(new Coffee("Americano", 10).addIngredient("Espresso", 1).
                addIngredient("Hot Water", 4));
        coffeeList.add(new Coffee("Hot Water", 3).addIngredient("Hot Water", 5));
    }

    public void chooseCoffee() {
        int iter = 1;
        for (Coffee coffee:coffeeList) {
            System.out.println(iter + ". " + coffee.getName() + " (" + coffee.getPrice() + "tl)"); // bütün seçenekleri yazdır
            iter++;
        }

        System.out.println("Lütfen içmek istediğiniz kahvenin numarasını giriniz.");
        int coffeeNumber = -1;
        try { // kullanıcıdan doğru girdi alınıp alınmaddığnın kontrolü
            coffeeNumber = new Scanner(System.in).nextInt() - 1;
        } catch (Exception e) {
            System.out.println("Lütfen bir sayı giriniz!\n");
            chooseCoffee();
            return;
        }

        if(coffeeNumber >= 0 && coffeeNumber< coffeeList.size()) { // kullanıcının mevcut seçenekler arasından seçmesinin kontrolü
            System.out.println("Teşekkürler kahveniz hazırlanıyor. \n");
            prepareCoffee(coffeeNumber); // bir sonraki aşamaya geçiş
        }
        else {
            System.out.println("Yanlış bir seçim yaptınız!\n");
            chooseCoffee();
        }
    }

    private void prepareCoffee(int coffeeNumber) {
        Coffee chosenCoffee = coffeeList.get(coffeeNumber);

        System.out.print(chosenCoffee.getName() + " seçtiniz. Bu kahvemiz; ");
        for (Map.Entry<String, Integer> ingredient: chosenCoffee.getRecipe().entrySet()
             ) {
            System.out.print("\n" + ingredient.getValue() + " doz " + ingredient.getKey() + " ");
        }
        System.out.println("içermektedir. Afiyet Olsun.");
    }

}



