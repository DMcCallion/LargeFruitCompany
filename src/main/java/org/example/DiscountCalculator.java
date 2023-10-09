package org.example;


public class DiscountCalculator {
    final static float PERCENTAGE_APPLE_DISCOUNT = 0.1f; //percentage of total price that apples are reduced by
    final static int CHERRIES_FOR_DISCOUNT = 4;
    final static int FLAT_CHERRY_DISCOUNT = 50; // in pennies
    final static int MANGOES_FOR_FREE_APPLE = 3;
    final static int BIG_SPENDER_FLOOR = 500; //in pennies
    final static float BIG_SPENDER_PERCENTAGE = 0.02f;

    public boolean wasMangoDiscountApplied = false;

    private void applyAppleDiscount(Basket basket) {
        //This will work for now, but probably isn't best practice because if apple price stops being nicely divisible
        //We might lose some pennies.
        if (wasMangoDiscountApplied) {
            basket.basketValue -= (int) ((basket.fruitCount("APPLE") - 1) * (Apple.price) * PERCENTAGE_APPLE_DISCOUNT);
        } else {
            basket.basketValue -= (int) (basket.fruitCount("APPLE") * (Apple.price) * PERCENTAGE_APPLE_DISCOUNT);
        }

    }

    private void applyMangoDiscount(Basket basket) {

        // If enough mangoes, and there's an apple
        if (basket.fruitCount("MANGO") >= MANGOES_FOR_FREE_APPLE && basket.fruitCount("APPLE") >= 1) {
            for (Fruit content : basket.contents) {
                if ("APPLE".equals(content.type)) {
                    basket.basketValue -= content.price; // First apple is free - total minus price of apple
                    this.wasMangoDiscountApplied = true;
                    break;
                }
            }
        }
    }

    private void applyCherryDiscount(Basket basket) {
        if (basket.fruitCount("CHERRY") >= CHERRIES_FOR_DISCOUNT) {
            basket.basketValue -= FLAT_CHERRY_DISCOUNT;
        }
    }


    private void applyBigSpender(Basket basket) {
        if (basket.basketValue > BIG_SPENDER_FLOOR) {
            basket.basketValue -= (int) (basket.basketValue * BIG_SPENDER_PERCENTAGE);
        }
    }


    public void doAllTheDiscounts(Basket basket) {
        this.applyMangoDiscount(basket);
        this.applyAppleDiscount(basket);
        this.applyCherryDiscount(basket);
        this.applyBigSpender(basket);
    }
}


/*

If you spend more than £5 (once all other discounts are taken into account) you get a 2% big spender discount


All Apples are currently 10% off
If you buy 3 or more Mangoes you get 1 Apple free
If you buy more than 4 cherries you get a 50p discount
 */