package
com.design.parkinglot.vehicles;


import com.design.parkinglot.enums.VehicleType;
import com.design.parkinglot.gates.Ticket;

public abstract class Vehicle {
    private final String vehicleNo;
    private VehicleType vehicleType;
    private Ticket ticket;

    public Vehicle(String vehicleNo, VehicleType vehicleType) {
        this.vehicleNo = vehicleNo;
        this.vehicleType = vehicleType;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void assignTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
