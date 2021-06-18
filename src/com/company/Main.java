package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        CoffeMachine kahveMakinesi = new CoffeMachine();
        System.out.println(kahveMakinesi.getCoffeeList().get(0).getName());
    }
}
