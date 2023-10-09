package org.example;

public class Main {
    public static void main(String[] args) {

        Fruit apple = new Apple();
        Fruit orange = new Fruit("ORANGE", 75);
        Fruit mango = new Fruit("MANGO", 250);
        Fruit cherry = new Fruit("CHERRY", 24);

        Basket basket = new Basket();

        basket.addFruit(apple);
        basket.addFruit(apple);
        basket.addFruit(apple);
        basket.addFruit(mango);
        basket.addFruit(mango);
        basket.addFruit(mango);
        basket.printContents();

        System.out.println(basket.basketValue);

        DiscountCalculator disc = new DiscountCalculator();

        disc.doAllTheDiscounts(basket);
        System.out.println(basket.basketValue);

    }
}


/*
TODO
- CLI
- Typo and other error handling

Tests:
- valid input
- invalid input
- shopping basket methods work as expected (calculating basket value correctly)

 */