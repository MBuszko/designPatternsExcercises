package com.sda.decorator;


public class Mozzarella extends ToppingDecorator {

    protected Mozzarella(Pizza newPizza) {
        super(newPizza);
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Mozzarella";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 0.5;
    }
}
