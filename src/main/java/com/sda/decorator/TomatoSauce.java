package com.sda.decorator;


public class TomatoSauce extends ToppingDecorator {
    protected TomatoSauce(Pizza newPizza) {
        super(newPizza);

    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Tomato Sauce";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.35;
    }
}
