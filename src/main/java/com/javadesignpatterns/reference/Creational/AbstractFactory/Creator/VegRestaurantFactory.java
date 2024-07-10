package com.javadesignpatterns.reference.Creational.AbstractFactory.Creator;

import com.javadesignpatterns.reference.Creational.AbstractFactory.ProductA.Burger;
import com.javadesignpatterns.reference.Creational.AbstractFactory.ProductA.VegBurger;
import com.javadesignpatterns.reference.Creational.AbstractFactory.ProductB.Pizza;
import com.javadesignpatterns.reference.Creational.AbstractFactory.ProductB.VegPizza;

public class VegRestaurantFactory implements ResturantFactory{
    @Override
    public Burger createBurger() {
        return new VegBurger();
    }

    @Override
    public Pizza createPizza() {
        return new VegPizza();
    }
}
