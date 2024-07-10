package com.javadesignpatterns.reference.Creational.AbstractFactory.Creator;

import com.javadesignpatterns.reference.Creational.AbstractFactory.ProductA.Burger;
import com.javadesignpatterns.reference.Creational.AbstractFactory.ProductB.Pizza;

public interface ResturantFactory {
    Burger createBurger();
    Pizza createPizza();
}
