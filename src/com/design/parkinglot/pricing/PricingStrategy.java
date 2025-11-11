package com.design.parkinglot.pricing;


import com.design.parkinglot.gates.Ticket;

public interface PricingStrategy {
    double calculateParkingFee(Ticket ticket);
}