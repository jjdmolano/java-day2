package com.zuitt.app;

public class Car {
    double fuel = 0;
    double fuelMaxLimit = 45    ;
    double mileage = 0;

    public void drive(double distanceInMeters) {
//        20km = 1L
//        add to mileage
//        consume fuel
        System.out.println("Your new mileage is ");
        System.out.println("Your new fuel consumption is ");
    }

    public void refuel(double fuelAmount) {
//        add to fuel
        System.out.println("You refueled " + " liters");
        System.out.println("Total fuel in tank is " + " liters");
    }
}
