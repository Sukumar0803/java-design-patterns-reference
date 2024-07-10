package com.javadesignpatterns.reference.Creational.ProtoType;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public abstract class Vehicle {

    private String name;
    private String color;
    private String model;

    public Vehicle(String name, String color, String model) {
        this.name = name;
        this.color = color;
        this.model = model;
    }

    protected Vehicle(Vehicle vehicle) {
        this.name = vehicle.name;
        this.color = vehicle.color;
        this.model = vehicle.model;
    }

    public abstract Vehicle clone();
}
