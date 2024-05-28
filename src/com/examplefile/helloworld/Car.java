package com.examplefile.helloworld;

public class Car {
    int modelYear;
    String modelName;

    public Car(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Car myCar = new Car(2024, "Macan GTS");
        System.out.println(myCar.modelYear + " " + myCar.modelName);


    }
}