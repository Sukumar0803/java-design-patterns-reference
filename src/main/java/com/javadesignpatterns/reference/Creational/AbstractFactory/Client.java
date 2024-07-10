package com.javadesignpatterns.reference.Creational.AbstractFactory;

import com.javadesignpatterns.reference.Creational.AbstractFactory.Creator.ResturantFactory;
import com.javadesignpatterns.reference.Creational.AbstractFactory.Creator.ChickenRestaurantFactory;
import com.javadesignpatterns.reference.Creational.AbstractFactory.Creator.VegRestaurantFactory;

public class Client {

    public static void main(String[] args) {

        ResturantFactory factory = new VegRestaurantFactory();
        factory.createBurger().prepareBurger();
        factory.createPizza().preparePizza();


        ResturantFactory factory1 = new ChickenRestaurantFactory();
        factory1.createBurger().prepareBurger();
        factory1.createPizza().preparePizza();


    }
}
