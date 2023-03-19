package org.example;

/* Class Vehicle is defined as an interface because the only information we received is that each vehicle can only have
 *  behaviours as: start, stop and drive.
 *  Also, the methods are only defined, without a body, as an interface does not really implement how a method should work,
 *  and it is not called in the main class (App).
 * */

public interface Vehicle {

    void start();

    void stop();

    void drive(double km);
}
