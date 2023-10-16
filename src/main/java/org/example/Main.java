package org.example;

import org.example.discount.*;
import org.example.fruit.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



import java.util.Scanner;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        LOGGER.info("Example log from {}", Main.class.getSimpleName());
        Fruit apple = new Apple();
        Fruit orange = new Orange();
        Fruit mango = new Mango();
        Fruit cherry = new Cherry();

        Basket basket = new Basket();

        MangoDiscount mangoDiscount = new MangoDiscount();
        AppleDiscount appleDiscount = new AppleDiscount();
        CherryDiscount cherryDiscount = new CherryDiscount();
        BigSpenderDiscount bigSpenderDiscount = new BigSpenderDiscount();

        StringFormatter output = new StringFormatter();


        Scanner scanner = new Scanner(System.in);


        while (basket.getContents().isEmpty()) {
            System.out.println("Enter all fruit, separated by spaces");
            String[] inputs = scanner.nextLine().toUpperCase().split(" ");
            for (String fruit : inputs) {
                switch (fruit) {
                    case "APPLE":
                        basket.addFruit(apple);
                        break;
                    case "ORANGE":
                        basket.addFruit(orange);
                        break;
                    case "MANGO":
                        basket.addFruit(mango);
                        break;
                    case "CHERRY":
                        basket.addFruit(cherry);
                        break;
                    default:
                        System.out.println("Invalid Fruit or Typo");
                }
            }
        }

        output.printFruitCount(basket);

        output.printTotal(basket, "Sub-total");

        //Discount Section
        output.printDiscounts(basket);

        //A printer class has issues here because the discount class is doing some conditional printing
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

        output.printTotal(basket, "Total");
    }
}


/*
TODO

- error handling
 */
