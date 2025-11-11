package com.design.parkinglot.pricing;


import com.design.parkinglot.gates.Ticket;

public class CostCalculator {
    private PricingStrategy pricingStrategy;

    public CostCalculator(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double calculateTicketCost(Ticket ticket) {
        return pricingStrategy.calculateParkingFee(ticket);
    }
}