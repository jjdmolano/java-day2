package com.zuitt.app;

public class Car {
    double fuel = 0;
    double fuelMaxLimit = 45000; // mL
    double mileage = 0; // km

    public void drive(double distanceInMeters) {
//        20km = 1L
        double consumptionFormula = 20; // converted to km/L
        double newMileage = distanceInMeters / 1000; // converted to km
        double consumption = (newMileage / consumptionFormula); // in L

//      function to not drive on empty fuel
        if(fuel == 0) {
            System.out.println("You cannot drive with no fuel!");
        } else if(consumption > fuel) {
            System.out.println("You will run out of gas before you finish this trip!");
        } else {
    //        add to mileage
            mileage += newMileage;
    //        consume fuel
            fuel -= consumption;

            System.out.println("Your new mileage is " + mileage + " kilometers");
            System.out.println("Your new fuel consumption is " + consumption + " liters");
            System.out.println("Your current fuel amount is " + fuel + " liters");
        }
    }

//    fuelAmount is in L
    public void refuel(double fuelAmount) {

        double refuelAmount = fuelAmount * 1000; // converted to mL
        double currentFuel = fuel + fuelAmount; // L

//      function to not go over max limit
        if(refuelAmount > fuelMaxLimit) {
            System.out.println("You cannot refill over the max limit!");
        } else {
//          add to fuel
            fuel += fuelAmount;

            System.out.println("You refueled " + fuelAmount + " liters");
            System.out.println("Total fuel in tank is " + currentFuel + " liters");
        }
    }
}
