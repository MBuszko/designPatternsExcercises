package com.sda.decorator;


public abstract class ToppingDecorator implements Pizza {

    protected Pizza tempPizza;

    protected ToppingDecorator(Pizza newPizza) {
        this.tempPizza = newPizza;
    }


    @Override
    public String getDescription() {
        return tempPizza.getDescription();
    }

    @Override
    public double getCost() {
        return tempPizza.getCost();
    }
}
