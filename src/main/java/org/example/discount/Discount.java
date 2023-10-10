package org.example.discount;

import org.example.Basket;

public interface Discount {
    boolean checkValid(Basket basket);

    void applyDiscount(Basket basket);

}
