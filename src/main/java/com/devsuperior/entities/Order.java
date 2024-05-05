package com.devsuperior.entities;

public class Order {

    private String code;
    private double basicValue;
    private double discountPercentage;


    public Order(String code, double basicValue, double discountPercentage) {
        this.code = code;
        this.basicValue = basicValue;
        this.discountPercentage = discountPercentage;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getBasicValue() {
        return basicValue;
    }

    public void setBasicValue(double basicValue) {
        this.basicValue = basicValue;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
}
