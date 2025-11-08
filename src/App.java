import com.example.strategy.Drive;
import com.example.strategy.ElectricDrive;
import com.example.strategy.NormalDrive;
import com.example.strategy.SportsDrive;

public class App {
    public static void main(String[] args) throws Exception {
        Drive sedan=new Drive(new NormalDrive());
        Drive bmw=new Drive(new SportsDrive());
        Drive tesla=new Drive(new ElectricDrive());
        sedan.drive();
        bmw.drive();
        tesla.drive();

    }
}
