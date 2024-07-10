package com.javadesignpatterns.reference.Creational.FactoryMethod.Creator;

import com.javadesignpatterns.reference.Creational.FactoryMethod.product.Burger;
import com.javadesignpatterns.reference.Creational.FactoryMethod.product.VegBurger;

public class VegBurgerFactory extends BurgerFactory {
    @Override
    public Burger createBurger() {
        return new VegBurger();
    }
}
