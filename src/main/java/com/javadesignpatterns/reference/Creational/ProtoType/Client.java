package com.javadesignpatterns.reference.Creational.ProtoType;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        Vehicle vehicle = new Car("Test-1", "Test-2", "Test-3", 100);
        System.out.println(vehicle);
        vehicles.add(vehicle);
        Vehicle clone = vehicle.clone();
        vehicles.add(clone);
        System.out.println(clone);


        Vehicle vehicle1 = new Bike("Test-1", "Test-2", "Test-3", "India");
        System.out.println(vehicle1);
        vehicles.add(vehicle1);
        Vehicle clone1 = vehicle1.clone();
        System.out.println(clone1);
        vehicles.add(clone1);

        List<Vehicle> copyVehicles = new ArrayList<>();

        for (Vehicle v : vehicles) {
            copyVehicles.add(v.clone());
        }

        copyVehicles.forEach(System.out ::println);
    }
}
