package org.example;

import org.example.fruit.Fruit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FruitTest {
    Fruit testFruit = new Fruit("APPLE", 80);
    @Test
    void getType() {

        assertEquals(testFruit.getType(),"APPLE");
    }


    @Test
    void getPrice() {
        assertEquals(testFruit.getPrice(), 80);
    }

    @Test
    void setPrice() {
        testFruit.setPrice(200);
        assertEquals(testFruit.getPrice(), 200);
    }
}