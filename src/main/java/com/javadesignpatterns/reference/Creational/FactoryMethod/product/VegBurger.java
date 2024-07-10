package com.javadesignpatterns.reference.Creational.FactoryMethod.product;

public class VegBurger implements Burger {

    @Override
    public void prepareBurger() {
        System.out.println("Preparing Veg Burger........");
    }
}
