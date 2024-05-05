package com.devsuperior.entities;

public class Employer {

    private String name;
    private double grossSalary;

    public Employer(){

    }

    public Employer(double grossSalary, String name) {
        this.grossSalary = grossSalary;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }
}
