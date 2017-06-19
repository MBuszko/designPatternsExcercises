package com.sda.strategy;


public class Bird extends Animal {

    public Bird(String name, double height) {
        super(name, height);
        setFlyingType(new ItFlys());
    }
}
