package com.javadesignpatterns.reference.Creational.AbstractFactory.ProductB;

public class VegPizza implements Pizza {
    @Override
    public void preparePizza() {
        System.out.println("Preparing Veg Pizza............");
    }
}
