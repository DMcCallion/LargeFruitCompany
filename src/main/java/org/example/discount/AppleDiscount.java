package org.example.discount;

import org.example.fruit.Apple;
import org.example.Basket;

public class AppleDiscount implements Discount{
    final static float PERCENTAGE_APPLE_DISCOUNT = 0.1f; //percentage of total price that apples are reduced by
    @Override
    public boolean checkValid(Basket basket) { // Apple discount always happens
        return true;
    }

    @Override
    public void applyDiscount(Basket basket) {

        MangoDiscount mangoDiscount = new MangoDiscount();

        if (mangoDiscount.checkValid(basket)) { //If we already did mango discount, don't count the free apple here
            int reduction = (int) ((basket.fruitCount("APPLE") - 1) * Apple.price * PERCENTAGE_APPLE_DISCOUNT);
            basket.setBasketValue(basket.getBasketValue() - reduction);
            System.out.println("Apple Discount -" + reduction + "p");
        } else {
            int reduction = (int) (basket.fruitCount("APPLE") * (Apple.price) * PERCENTAGE_APPLE_DISCOUNT);
            basket.setBasketValue(basket.getBasketValue() -reduction);
            System.out.println("Apple Discount -" + reduction + "p");
        }

    }


}
