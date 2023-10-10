package org.example.discount;

import org.example.Basket;

public class CherryDiscount implements Discount{
    final static int CHERRIES_FOR_DISCOUNT = 4;
    final static int FLAT_CHERRY_DISCOUNT = 50; // in pennies
    @Override
    public boolean checkValid(Basket basket) {
        return basket.fruitCount("CHERRY") >= CHERRIES_FOR_DISCOUNT;

    }

    @Override
    public void applyDiscount(Basket basket) {
        basket.setBasketValue(basket.getBasketValue() - FLAT_CHERRY_DISCOUNT);
    }
}
