package org.example;

public class Fruit {
    String type;
    int price;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Fruit(String type, int price) {
        this.type = type;
        this.price = price;

    }
}
