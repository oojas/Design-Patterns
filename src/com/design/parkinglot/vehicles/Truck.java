package com.design.parkinglot.vehicles;


import com.design.parkinglot.enums.VehicleType;

public class Truck extends Vehicle {

    public Truck(String vehicleNumber) {
        super(vehicleNumber, VehicleType.LARGE_VEHICLE);
    }
}
