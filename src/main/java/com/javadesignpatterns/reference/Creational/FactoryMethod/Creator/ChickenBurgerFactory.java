package com.javadesignpatterns.reference.Creational.FactoryMethod.Creator;

import com.javadesignpatterns.reference.Creational.FactoryMethod.product.Burger;
import com.javadesignpatterns.reference.Creational.FactoryMethod.product.ChickenBurger;

public class ChickenBurgerFactory extends BurgerFactory {
    @Override
    public Burger createBurger() {
        return new ChickenBurger();
    }
}
