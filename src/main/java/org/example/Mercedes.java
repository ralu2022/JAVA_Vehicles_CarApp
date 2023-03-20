package org.example;

/* As a requirement we are asked to define an object(instance) of class named Mercedes, but this shouldn't compile. Therefore,
 *  we need to declare the class as abstract.
 *  Also, since class Mercedes will extend from class Car, all fields and methods will be inherited. But we need to define the
 *  constructor for fields that are final in class Car, so that the inheritance to work properly.
 */

public abstract class Mercedes extends Car {

    protected Mercedes(double fuelTankSize, String fuelType, double consumptionPer100km, int gear) {
        super(fuelTankSize, fuelType, consumptionPer100km, gear);
    }
}
