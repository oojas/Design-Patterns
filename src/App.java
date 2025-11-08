import com.example.observer_pattern.observable.IphoneObservable;
import com.example.observer_pattern.observable.IphoneObservableImpl;
import com.example.observer_pattern.observer.ClientObserver;

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
        IphoneObservableImpl iphoneObservable=new IphoneObservableImpl();
        ClientObserver clientObserver = new ClientObserver("Ashok Gupta","agd@gmail.com","656876453",true);
        ClientObserver clientObserver1 = new ClientObserver("Ramila Dutta","sudh@gmail.com","657532143",false);
        ClientObserver clientObserver2=new ClientObserver("Ojasesd Sharma","sdfhui@gmail.com","5754123576",true);
        iphoneObservable.add(clientObserver);
        iphoneObservable.add(clientObserver1);
        iphoneObservable.add(clientObserver2);
        iphoneObservable.setCount(0);
        iphoneObservable.setCount(10);
    }


}
