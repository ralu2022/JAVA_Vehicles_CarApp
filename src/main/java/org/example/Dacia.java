package org.example;

/* As a requirement we are asked to define an object(instance) of class named Dacia, but shouldn't compile. Therefore,
 *  we need to declare the class as abstract.
 *  Also, since class Dacia will extend from class Car, all fields and methods will be inherited. But we need to define the
 *  constructor for fields that are final in class Car, so that the inheritance to work properly.
 */

public abstract class Dacia extends Car {
    protected Dacia(double fuelTankSize, String fuelType, double consumptionPer100km, int gear) {
        super(fuelTankSize, fuelType, consumptionPer100km, gear);
    }
}
