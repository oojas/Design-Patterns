
import com.design.parkinglot.enums.PaymentMode;
import com.design.parkinglot.enums.VehicleType;
import com.design.parkinglot.gates.EntryGate;
import com.design.parkinglot.gates.ExitGate;
import com.design.parkinglot.gates.Ticket;
import com.design.parkinglot.parkingspots.ParkingSpotFactory;
import com.design.parkinglot.parkingspots.ParkingSpotManager;
import com.design.parkinglot.pricing.CostCalculator;
import com.design.parkinglot.pricing.HourlyPricingStrategy;
import com.design.parkinglot.vehicles.Car;
import com.design.parkinglot.vehicles.Motorcycle;
import com.design.parkinglot.vehicles.Truck;
import com.design.parkinglot.vehicles.Vehicle;
import com.example.patterns.decorator_pattern.*;
import com.example.patterns.factory_pattern.Shape;
import com.example.patterns.factory_pattern.ShapeImpl;
import com.example.patterns.observer_pattern.observable.IphoneObservableImpl;
import com.example.patterns.observer_pattern.observer.ClientObserver;
import com.example.patterns.strategy_pattern.Drive;
import com.example.patterns.strategy_pattern.ElectricDrive;
import com.example.patterns.strategy_pattern.NormalDrive;
import com.example.patterns.strategy_pattern.SportsDrive;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        * STRATEGY PATTERN
        *



        Drive sedan=new Drive(new NormalDrive());
        Drive bmw=new Drive(new SportsDrive());
        Drive tesla=new Drive(new ElectricDrive());
        sedan.drive();
        bmw.drive();
        tesla.drive();
          */

        /*
        * OBSERVER PATTERN


        IphoneObservableImpl iphoneObservable=new IphoneObservableImpl();
        ClientObserver clientObserver = new ClientObserver("Ashok Gupta","agd@gmail.com","656876453",true);
        ClientObserver clientObserver1 = new ClientObserver("Ramila Dutta","sudh@gmail.com","657532143",false);
        ClientObserver clientObserver2=new ClientObserver("Ojasesd Sharma","sdfhui@gmail.com","5754123576",true);
        iphoneObservable.add(clientObserver);
        iphoneObservable.add(clientObserver1);
        iphoneObservable.add(clientObserver2);
        iphoneObservable.setCount(0);
        iphoneObservable.setCount(10);
      */

        /*
        * DECORATOR PATTERN
        *
        BasePizza pizza=new Mushroom(new Margerita());
        BasePizza pizza1=new Jelepeeno(new Farmhouse());
        BasePizza pizza2=new Jelepeeno(new Mushroom(new IndiTandoori()));
        System.out.println("PIZZA WITH MUSHROOM AND MARGERITA COST "+ pizza.cost());
        System.out.println("PIZZA WITH JELEPEENO AND FARMHOUSE COST "+pizza1.cost());
        System.out.println("PIZZA WITH JELEPEENO AND MUSHROOM ON INDITANDOORI COST "+pizza2.cost());

         */
        /*
        FACTORY PATTERN
        ShapeImpl circleShape=new ShapeImpl("CIRCLE");
        ShapeImpl squareShape=new ShapeImpl("SQUARE");
        ShapeImpl rectShape=new ShapeImpl("RECTANGLE");
        Shape c=circleShape.getShape();
        Shape s=squareShape.getShape();
        Shape r=rectShape.getShape();
        c.draw();
        s.draw();
        r.draw();

         */
        System.out.println("\n###### LLD ParkingLot Implementation ######");
        ParkingSpotManager spotManager = ParkingSpotManager.getInstance();

        // Create parking spots using factory
        spotManager.addParkingSpot(ParkingSpotFactory.createParkingSpot("M1", VehicleType.TWO_WHEELER));
        spotManager.addParkingSpot(ParkingSpotFactory.createParkingSpot("C1", VehicleType.FOUR_WHEELER));
        spotManager.addParkingSpot(ParkingSpotFactory.createParkingSpot("L1", VehicleType.LARGE_VEHICLE));

        // Initialize pricing strategy
        CostCalculator costCalculator = new CostCalculator(new HourlyPricingStrategy());
        spotManager.setCostCalculator(costCalculator);

        // Create gates
        EntryGate entryGate = new EntryGate();
        ExitGate exitGate = new ExitGate();
        spotManager.setEntryGate(entryGate);
        spotManager.setExitGate(exitGate);

        System.out.println("=====>>> Available Spots: " + spotManager.getAvailableSpotsCount());

        // Simulate parking
        Vehicle vehicle1 = new Motorcycle("KA-01-HH-5577");
        Ticket ticket1 = entryGate.issueTicket(vehicle1);

        Vehicle vehicle2 = new Car("MH-01-HH-1234");
        Ticket ticket2 = entryGate.issueTicket(vehicle2);

        Vehicle vehicle3 = new Truck("DL-01-HH-9099");
        Ticket ticket3 = entryGate.issueTicket(vehicle3);

        // Simulate exit
        exitGate.processTicket(ticket1, PaymentMode.CASH);
        exitGate.processTicket(ticket2, PaymentMode.UPI);
        exitGate.processTicket(ticket3, PaymentMode.CREDIT_CARD);
    }


}
