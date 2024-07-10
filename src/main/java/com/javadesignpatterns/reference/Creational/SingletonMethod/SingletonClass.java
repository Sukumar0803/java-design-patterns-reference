package com.javadesignpatterns.reference.Creational.SingletonMethod;

import java.io.Serializable;

public class SingletonClass implements Serializable {

    // to handle in Multi Threading
    private static volatile SingletonClass INSTANCE ;

    private SingletonClass(){

    }

    // Double locked synchronized block
    public static SingletonClass getInstance() {
        SingletonClass result = INSTANCE;
        if(result == null) {
            synchronized (SingletonClass.class){
                if(result == null){
                    System.out.println("Class Object created...........");
                    INSTANCE = new SingletonClass();
                }
            }
        }
        return INSTANCE;
    }
}
