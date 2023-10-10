package org.example;

import org.example.discount.*;
import org.example.fruit.*;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Fruit apple = new Apple();
        Fruit orange = new Orange();
        Fruit mango = new Mango();
        Fruit cherry = new Cherry();

        Basket basket = new Basket();

        MangoDiscount mangoDiscount = new MangoDiscount();
        AppleDiscount appleDiscount = new AppleDiscount();
        CherryDiscount cherryDiscount = new CherryDiscount();
        BigSpenderDiscount bigSpenderDiscount = new BigSpenderDiscount();


        System.out.println("Enter all fruit, separated by spaces");
        Scanner scanner = new Scanner(System.in);


        String[] inputs = scanner.nextLine().toUpperCase().split(" ");


        for (String fruit : inputs) {
            switch (fruit) {
                case "APPLE" :
                    basket.addFruit(apple);
                    break;
                case "ORANGE" :
                    basket.addFruit(orange);
                    break;
                case "MANGO" :
                    basket.addFruit(mango);
                    break;
                case "CHERRY" :
                    basket.addFruit(cherry);
                    break;
                default:
                    System.out.println("Invalid Fruit or Typo");
            }
        }
        System.out.println(basket.getContents());
        basket.printContents();
        System.out.println(basket.getBasketValue());

        if (mangoDiscount.checkValid(basket)) {
            mangoDiscount.applyDiscount(basket);
        }
        if (appleDiscount.checkValid(basket)) {
            appleDiscount.applyDiscount(basket);
        }
        if (cherryDiscount.checkValid(basket)) {
            cherryDiscount.applyDiscount(basket);
        }
        if (bigSpenderDiscount.checkValid(basket)) {
            bigSpenderDiscount.applyDiscount(basket);
        }

        System.out.println(basket.getBasketValue());

    }
}


/*
TODO

- error handling
 */
