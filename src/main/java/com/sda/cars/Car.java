package com.sda.cars;

public class Car {

    private int year;
    private String model;
    private String mark;
    private int displacement;
    private String fuelType;
    private int vMax;

    public Car(int year, String model, String mark, int displacement, String fuelType, int vMax) {
        this.year = year;
        this.model = model;
        this.mark = mark;
        this.displacement = displacement;
        this.fuelType = fuelType;
        this.vMax = vMax;
    }

    public Car() {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getvMax() {
        return vMax;
    }

    public void setvMax(int vMax) {
        this.vMax = vMax;
    }
}
