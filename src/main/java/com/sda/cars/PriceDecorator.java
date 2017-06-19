package com.sda.cars;

public abstract class PriceDecorator implements PriceCalculator {

    protected PriceCalculator priceCalculator;

    public PriceDecorator(PriceCalculator priceCalculator) {
        this.priceCalculator = priceCalculator;
    }
}
