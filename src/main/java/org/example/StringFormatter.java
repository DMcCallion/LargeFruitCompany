package org.example;

public class StringFormatter {
        public void printFruitCount(Basket basket) {
                System.out.println(basket.fruitCount("APPLE") + " x Apple");
                System.out.println(basket.fruitCount("ORANGE") + " x Orange");
                System.out.println(basket.fruitCount("MANGO") + " x Mango");
                System.out.println(basket.fruitCount("CHERRY") + " x Cherry");

        }

        public void printTotal(Basket basket, String totalType) {
                String subtotal = Integer.toString(basket.getBasketValue());

                if (subtotal.length() == 2) {
                        subtotal = "0." + subtotal;
                } else {
                        subtotal = subtotal.substring(0, subtotal.length()-2) + "." + subtotal.substring(subtotal.length()-2);
                }


                System.out.println(totalType + " £" + subtotal);

        }

        public void printDiscounts(Basket basket) {
                System.out.println("Discounts");
        }

}
