package com.javadesignpatterns.reference.Creational.AbstractFactory.ProductB;

public class ChickenPizza implements Pizza{
    @Override
    public void preparePizza() {
        System.out.println("Preparing Chicken Pizza........");
    }
}
