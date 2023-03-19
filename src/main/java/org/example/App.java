package org.example;

/*
 * The main App class si defined in order to create an application that represents the behaviour of a car that is
 * considered to be of a vehicle type.
 *
 * Each car has:
 *    - standard properties: size of the tank, type of fuel (Diesel, Petrol), gears and consumption/100km;
 *    - configurable properties: available fuel, size of tires;
 *    - specific element: chassis number;
 *
 * Every car can:
 *    - keep track of the fuel consumption during start() and stop();
 *    - reset the consumption stats every time the car starts;
 *    - be driven for N km in different gears.
 *
 * */

public class App {
    public static void main(String[] args) {
        // Car car = new Car(); // this should not compile.

        // Car carEx = new Dacia(27, "oiqe0934hkkadsn"); // this should not compile! If I want to create a Dacia car, I will need to create an instance of a Dacia model.

        Car car = new Logan(27, "Diesel", 5.6, 5); // Logan can extend from Dacia, while Dacia extends from Car

        System.out.println("Car number 1: " + "\n");
        car.availableFuel = 45.5;
        car.start();

        car.shiftGear(1);

        car.drive(0.0); // drives 0.01 KMs

        car.shiftGear(2);

        car.drive(0.2);

        car.shiftGear(3);

        car.drive(0.3);

        car.shiftGear(4);

        car.drive(0.4);

        car.shiftGear(5);

        car.drive(0.5);

        car.shiftGear(6);

        car.drive(0.6);

        car.shiftGear(4);

        car.drive(0.7);

        car.shiftGear(3);

        car.drive(0.8);

        car.stop();

        double availableFuel = car.availableFuel;

        double fuelConsumedPer100Km = car.getAverageFuelConsumption();

        System.out.println("Car number 2: " + "\n");

        Vehicle vehicle = new SKlasse(45, "Gas", 8.5, 4); // available fuel and chassis number

        vehicle.start();

        vehicle.drive(1);

        vehicle.stop();

        Car car1 = (Car) vehicle;

        double availableFuelCar2 = ((Car) vehicle).availableFuel;

        double fuelConsumedPer100KmCar2 = car1.getAverageFuelConsumption();

        System.out.println("Consumption according to tire size for car1: ");

        car1.drive(2);
        car1.tireSize = 16;
        car1.calculateAverageFuelConsumptionTires(10);

    }
}
