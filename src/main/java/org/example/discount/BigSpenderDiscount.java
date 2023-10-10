package org.example.discount;

import org.example.Basket;

public class BigSpenderDiscount implements Discount{

    final static int BIG_SPENDER_FLOOR = 500; //in pennies
    final static float BIG_SPENDER_PERCENTAGE = 0.02f;
    @Override
    public boolean checkValid(Basket basket) {
        return basket.getBasketValue() >= BIG_SPENDER_FLOOR;
    }

    @Override
    public void applyDiscount(Basket basket) {
        basket.setBasketValue(basket.getBasketValue() -
                (int) (basket.getBasketValue() * BIG_SPENDER_PERCENTAGE));
    }
}
