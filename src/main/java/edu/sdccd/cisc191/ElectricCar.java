package edu.sdccd.cisc191;

public class ElectricCar extends Car implements Chargeable {
    private int batteryCharge;
    public ElectricCar(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] options, int numberOfDoors) {
        super(manufacturerName, milesOnVehicle, price, numberOfSeats, options, numberOfDoors);
        batteryCharge = 0;
    }

    @Override
    public int getBatteryCharge() {
        return batteryCharge;
    }

    @Override
    public void chargeUp() {
        batteryCharge = 100;
    }
}
