package org.example;

import java.util.ArrayList;

public class Basket {

    ArrayList<Fruit> contents = new ArrayList<>();
    int basketValue = 0;

    public void printContents() {
        for (Fruit content : this.contents) {
            System.out.println(content.type);
        }
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
            if (fruit.equals(content.type)) {
                count++;
            }
        }
        return count;
    }
}
