package org.example.fruit;

import java.util.*;

public class FruitRepository {
    public Map<String, Fruit> fruitMap = new HashMap<String, Fruit>();

    public FruitRepository() {
        fruitMap.put("APPLE", new Apple());
        fruitMap.put("ORANGE", new Orange());
        fruitMap.put("MANGO", new Mango());
        fruitMap.put("CHERRY", new Cherry());
    }

    public Fruit getFruitByName(String name) {
        //could return null
        return fruitMap.get(name);
    }
}
