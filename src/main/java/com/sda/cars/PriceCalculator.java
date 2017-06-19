package com.sda.cars;

import java.math.BigDecimal;

public interface PriceCalculator {

    BigDecimal calculate(Car car);
}
