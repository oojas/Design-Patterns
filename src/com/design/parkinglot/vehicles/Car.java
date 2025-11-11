package com.design.parkinglot.vehicles;


import com.design.parkinglot.enums.VehicleType;

public class Car extends Vehicle {

    public Car(String vehicleNumber) {
        super(vehicleNumber, VehicleType.FOUR_WHEELER);
    }
}
