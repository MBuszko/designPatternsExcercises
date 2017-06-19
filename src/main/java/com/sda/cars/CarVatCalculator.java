package com.sda.cars;

import java.math.BigDecimal;

public class CarVatCalculator extends PriceDecorator {

    public static final double VAT = 1.23;

    public CarVatCalculator(PriceCalculator priceCalculator) {
        super(priceCalculator);
    }

    @Override
    public BigDecimal calculate(Car car) {
        BigDecimal current = priceCalculator.calculate(car);
        return current.multiply(new BigDecimal(VAT));
    }
}
