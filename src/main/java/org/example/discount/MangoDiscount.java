package org.example.discount;

import org.example.Basket;
import org.example.fruit.Apple;
import org.example.fruit.Fruit;

public class MangoDiscount implements Discount{
    final static int MANGOES_FOR_FREE_APPLE = 3;
    @Override
    public boolean checkValid(Basket basket) {
        return basket.fruitCount("MANGO") >= MANGOES_FOR_FREE_APPLE && basket.fruitCount("APPLE") >= 1;
    }

    @Override
    public void applyDiscount(Basket basket) {
        for (Fruit content : basket.getContents()) {
            if ("APPLE".equals(content.getType())) {
                basket.setBasketValue(basket.getBasketValue() - content.price); // First apple is free - total minus price of apple
                System.out.println("1 Free Apple -" + Apple.price + "p");
                break;
            }
        }
    }

}
