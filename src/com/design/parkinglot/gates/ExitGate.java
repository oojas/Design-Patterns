package com.design.parkinglot.gates;

import com.design.parkinglot.enums.PaymentMode;
import com.design.parkinglot.parkingspots.ParkingSpotManager;
import com.design.parkinglot.payment.Payment;
import com.design.parkinglot.payment.PaymentFactory;

import java.time.LocalTime;

public class ExitGate {
    private ParkingSpotManager parkingSpotManager;

    public ExitGate() {
        this.parkingSpotManager = ParkingSpotManager.getInstance();
    }

    public void processTicket(Ticket ticket, PaymentMode paymentMode) {
        // Calculate parking duration and total fees
        ticket.setExitTime(LocalTime.now());
        double amountToPay = parkingSpotManager.getCostCalculator().calculateTicketCost(ticket);
        ticket.setParkingFee(amountToPay);

        // set the Mode of Payment opted by Customer
        Payment paymentInstance = PaymentFactory.getPaymentInstance(paymentMode, amountToPay);
        ticket.setPayment(paymentInstance);

        // Process Payment and Free the Parking Spot
        paymentInstance.processPayment();
        System.out.println("[+] Ticket " + ticket.getTicketNo() + " processed. Cost: $" + amountToPay);

        // Free the Parking Spot
        ParkingSpotManager.getInstance().unParkVehicle(ticket.getParkingSpot().getSpotId());
    }
}