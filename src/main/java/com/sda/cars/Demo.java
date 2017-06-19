package com.sda.cars;

public class Demo {

    public static void main(String[] args) {

        Car car = new Car(2017, "Yaris", "Toyota", 1400, "Petrol", 190);

        PriceCalculator priceCalculator = new CarVatCalculator(new BasicCalculator());

        System.out.printf("Cena brutto: %.2f", priceCalculator.calculate(car));

    }
}
