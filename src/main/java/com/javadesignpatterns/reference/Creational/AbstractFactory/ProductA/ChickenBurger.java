package com.javadesignpatterns.reference.Creational.AbstractFactory.ProductA;

public class ChickenBurger implements Burger {
    @Override
    public void prepareBurger() {
        System.out.println("Preparing Chicken Burger.........");
    }
}
