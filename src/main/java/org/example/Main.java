package org.example;

import org.example.discount.*;
import org.example.fruit.*;

public class Main {
    public static void main(String[] args) {

        Fruit apple = new Apple();
        Fruit orange = new Orange();
        Fruit mango = new Mango();
        Fruit cherry = new Cherry();

        Basket basket = new Basket();

        basket.addFruit(apple);
        basket.addFruit(apple);
        basket.addFruit(apple);
        basket.addFruit(mango);
        basket.addFruit(mango);
        basket.addFruit(mango);
        basket.printContents();

        System.out.println(basket.basketValue);

        MangoDiscount mangoDiscount = new MangoDiscount();
        AppleDiscount appleDiscount = new AppleDiscount();
        CherryDiscount cherryDiscount = new CherryDiscount();
        BigSpenderDiscount bigSpenderDiscount = new BigSpenderDiscount();


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

        System.out.println(basket.basketValue);

    }
}


/*
TODO
- CLI
- Typo and other error handling
 */
