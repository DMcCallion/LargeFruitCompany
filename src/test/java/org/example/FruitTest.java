package org.example;

import org.example.fruit.Fruit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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

    @Test
    void negativePrice() {
        testFruit.setPrice(-50);
        assertEquals(0, testFruit.getPrice());
    }

    @Test
    void mockGetType() {
        Fruit mockFruit = mock(Fruit.class);
        when(mockFruit.getType()).thenReturn("ORANGE");



        assertEquals("ORANGE", mockFruit.getType());
    }
}