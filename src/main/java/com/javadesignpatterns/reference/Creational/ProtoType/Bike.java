package com.javadesignpatterns.reference.Creational.ProtoType;

import lombok.ToString;

@ToString(callSuper = true)
public class Bike extends Vehicle {

    private String country;

    public Bike(String name, String color, String model,String country) {
        super(name, color, model);
        this.country = country;
    }

    public Bike(Bike bike) {
        super(bike);
        this.country = bike.country;
    }

    @Override
    public Bike clone() {
        return new Bike(this);
    }
}
