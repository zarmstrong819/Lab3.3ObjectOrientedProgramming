package edu.sdccd.cisc191;

public class HybridCar extends Car implements Chargeable, Combustible {
    private int batteryCharge;
    private int fuelLevel;
    public HybridCar(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] options, int numberOfDoors) {
        super(manufacturerName, milesOnVehicle, price, numberOfSeats, options, numberOfDoors);
    }

    @Override
    public int getBatteryCharge() {
        return batteryCharge;
    }

    @Override
    public void chargeUp() {
        batteryCharge = 100;
    }

    @Override
    public int getFuelLevel() {
        return fuelLevel;
    }

    @Override
    public void tankUp() {
        fuelLevel = 100;
    }
}
