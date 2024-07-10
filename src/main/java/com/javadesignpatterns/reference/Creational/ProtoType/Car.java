package com.javadesignpatterns.reference.Creational.ProtoType;

import lombok.ToString;

@ToString(callSuper = true)
public class Car extends Vehicle {

  private int speed;

  public Car(String name, String color, String model,int speed) {
      super(name, color, model);
      this.speed = speed;
  }
  public Car(Car car) {
      super(car);
      this.speed = car.speed;
  }

    @Override
    public Car clone() {
        return new Car(this);
    }
}
