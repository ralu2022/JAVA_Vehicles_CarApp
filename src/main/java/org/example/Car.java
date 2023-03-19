package org.example;

/* In our API (Application Programming Interface) we are asked to declare an instance as car model (Logan/SKlasse) that
 *  can have multiple behaviours:
 *         - start;
 *         - shift gears;
 *         - drive;
 *         - stop;
 * We also need to see the fuel average consumption depending on how the gears are changed and the size of the tires.
 *
 * This is the main class from which car brand classes will be extended. Here we define what the methods from our interface
 * Vehicle will do and also the other methods that are required by our application to function. Since this class is not used
 * to instance any object, it should be abstract.
 */


public abstract class Car implements Vehicle {

    protected final double fuelTankSize;
    protected final String fuelType;
    protected final double consumptionPer100km;
    protected final int maxGears;
    protected double availableFuel;
    protected int tireSize;
    String chassisNumber;
    protected double averageFuelConsumptionPerRide;
    protected int currentGear = 0;
    private double totalkm;
    private double totalFuelConsumed;

    protected Car(double fuelTankSize, String fuelType, double consumptionPer100km, int gear) {
        this.fuelTankSize = fuelTankSize;
        this.fuelType = fuelType;
        this.consumptionPer100km = consumptionPer100km;
        this.maxGears = gear;
    }

    @Override
    public void start() {
        System.out.println("Starting car: " + "\n");
        averageFuelConsumptionPerRide = 0;
    }

    @Override
    public void stop() {
        System.out.println("Stopping car: " + "\n");
        averageFuelConsumptionPerRide = 0;
        System.out.println("Available fuel: " + availableFuel + "\n");
        System.out.println("Consumed fuel: " + totalFuelConsumed + "\n");
    }

    protected void shiftGear(int gear) {

        if ((gear > maxGears) || (gear < 0)) {
            System.out.println("Invalid gear");
            return;
        }
        calculateAverageFuelConsumption(gear);
        currentGear = gear;
    }

    private void calculateAverageFuelConsumption(int gear) {

        if (this.currentGear < gear) {
            averageFuelConsumptionPerRide *= (1 + (gear - currentGear) / 10);
        } else {
            averageFuelConsumptionPerRide /= (1 + (currentGear - gear) / 10);
        }
    }

    @Override
    public void drive(double km) {
        double consumedFuel = (km * consumptionPer100km) / 100;
        availableFuel -= consumedFuel;
        System.out.println("Remaining fuel: " + availableFuel + "\n");
        totalkm += km;
        totalFuelConsumed += consumedFuel;

    }

    protected double getAverageFuelConsumption() {
        averageFuelConsumptionPerRide = totalFuelConsumed * 100 / totalkm;
        return averageFuelConsumptionPerRide;
    }


    protected void largerTires(int tire) {

        if ((tire > tireSize) || (tire < 0)) {
            System.out.println("Invalid tires");
            return;
        }
        calculateAverageFuelConsumption(tire);
        tireSize = tire;
    }

    protected void calculateAverageFuelConsumptionTires(int tire) {
        if (this.tireSize < tire) {
            averageFuelConsumptionPerRide *= (1 + (tire - tireSize) / 10);
        } else {
            averageFuelConsumptionPerRide /= (1 + (tireSize - tire) / 10);
        }
    }
}
