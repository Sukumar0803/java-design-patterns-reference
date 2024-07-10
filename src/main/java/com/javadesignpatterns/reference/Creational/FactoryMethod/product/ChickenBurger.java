package com.javadesignpatterns.reference.Creational.FactoryMethod.product;

public class ChickenBurger implements Burger {
    @Override
    public void prepareBurger() {
        System.out.println("Preparing Chicken Burger.........");
    }
}
