package com.javadesignpatterns.reference.Creational.AbstractFactory.ProductA;

public class VegBurger implements Burger {

    @Override
    public void prepareBurger() {
        System.out.println("Preparing Veg Burger........");
    }
}
