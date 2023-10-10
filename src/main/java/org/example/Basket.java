package org.example;

import org.example.fruit.Fruit;

import java.util.ArrayList;

public class Basket {

    ArrayList<Fruit> contents = new ArrayList<>();
    int basketValue = 0;

    public int getBasketValue() {
        return basketValue;
    }

    public void setBasketValue(int basketValue) {
        this.basketValue = basketValue;
    }

    public void printContents() {
        for (Fruit content : this.contents) {
            System.out.println(content.getType());
        }
    }

    public ArrayList<Fruit> getContents() {
        return contents;
    }

    public void setContents(ArrayList<Fruit> contents) {
        this.contents = contents;
    }

    public void addFruit(Fruit fruit) {
        this.contents.add(fruit);
        this.basketValue += fruit.price;
    }



    public int fruitCount(String fruit) {
        int count = 0;
        for (Fruit content : this.contents) {
            if (fruit.equals(content.getType())) {
                count++;
            }
        }
        return count;
    }
}
