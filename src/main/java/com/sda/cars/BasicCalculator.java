package com.sda.cars;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class BasicCalculator implements PriceCalculator {

    private Map<String, BigDecimal> markPrice;
    private Map<String, BigDecimal> modelPrice;

    public BasicCalculator() {
        markPrice = new HashMap<>();
        modelPrice = new HashMap<>();
        markPrice.put("Toyota", new BigDecimal(20000));
        modelPrice.put("Yaris", new BigDecimal(4000));
        modelPrice.put("Rav4", new BigDecimal(50000));
    }

    @Override
    public BigDecimal calculate(Car car) {

        String mark = car.getMark();
        String model = car.getModel();

        BigDecimal markPrice = this.markPrice.get(mark);
        BigDecimal modelPrice = this.modelPrice.get(model);

        return markPrice.add(modelPrice);
    }
}
