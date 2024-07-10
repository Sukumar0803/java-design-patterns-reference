package com.javadesignpatterns.reference.Creational.AbstractFactory.Creator;

import com.javadesignpatterns.reference.Creational.AbstractFactory.ProductA.Burger;
import com.javadesignpatterns.reference.Creational.AbstractFactory.ProductA.ChickenBurger;
import com.javadesignpatterns.reference.Creational.AbstractFactory.ProductB.ChickenPizza;
import com.javadesignpatterns.reference.Creational.AbstractFactory.ProductB.Pizza;

public class ChickenRestaurantFactory implements ResturantFactory{
    @Override
    public Burger createBurger() {
        return new ChickenBurger();
    }

    @Override
    public Pizza createPizza() {
        return new ChickenPizza();
    }
}
