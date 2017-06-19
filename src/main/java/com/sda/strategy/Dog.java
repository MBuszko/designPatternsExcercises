package com.sda.strategy;


public class Dog extends Animal {

    public Dog(String name, double height) {
        super(name, height);
        setFlyingType(new CantFly());
    }


}
