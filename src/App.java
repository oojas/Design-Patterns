
import com.example.patterns.decorator_pattern.*;
import com.example.patterns.observer_pattern.observable.IphoneObservableImpl;
import com.example.patterns.observer_pattern.observer.ClientObserver;
import com.example.patterns.strategy_pattern.Drive;
import com.example.patterns.strategy_pattern.ElectricDrive;
import com.example.patterns.strategy_pattern.NormalDrive;
import com.example.patterns.strategy_pattern.SportsDrive;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        * STRATERGY PATTERN
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


        BasePizza pizza=new Mushroom(new Margerita());
        BasePizza pizza1=new Jelepeeno(new Farmhouse());
        BasePizza pizza2=new Jelepeeno(new Mushroom(new IndiTandoori()));
        System.out.println("PIZZA WITH MUSHROOM AND MARGERITA COST "+ pizza.cost());
        System.out.println("PIZZA WITH JELEPEENO AND FARMHOUSE COST "+pizza1.cost());
        System.out.println("PIZZA WITH JELEPEENO AND MUSHROOM ON INDITANDOORI COST "+pizza2.cost());
    }


}
