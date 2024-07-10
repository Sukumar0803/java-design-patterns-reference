package com.javadesignpatterns.reference.Creational.FactoryMethod;

import com.javadesignpatterns.reference.Creational.FactoryMethod.Creator.BurgerFactory;
import com.javadesignpatterns.reference.Creational.FactoryMethod.Creator.ChickenBurgerFactory;
import com.javadesignpatterns.reference.Creational.FactoryMethod.Creator.VegBurgerFactory;

public class Client {

    public static void main(String[] args) {
        BurgerFactory factory1 = new ChickenBurgerFactory();
        factory1.createBurger().prepareBurger();

        BurgerFactory factory2 = new VegBurgerFactory();
        factory2.createBurger().prepareBurger();
    }
}
