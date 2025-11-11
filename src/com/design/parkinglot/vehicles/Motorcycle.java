package com.design.parkinglot.vehicles;


import com.design.parkinglot.enums.VehicleType;

public class Motorcycle extends Vehicle {

    public Motorcycle(String vehicleNumber) {
        super(vehicleNumber, VehicleType.TWO_WHEELER);
    }
}
