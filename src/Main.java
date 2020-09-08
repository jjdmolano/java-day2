import com.zuitt.app.Pencil;
import com.zuitt.app.Car;

public class Main {
    public static void main(String[] args) {
        Pencil pencil = new Pencil();

        pencil.write("The quick brown fox");
        pencil.getRemainingWritable();
        pencil.erase("Grumpy old wizards");
        pencil.getRemainingErasable();

        System.out.println("===================================================");

        Car car = new Car();

        car.refuel(10);
        car.drive(210000);
        car.drive(2000);
        car.refuel(20);
        car.drive(210000);
        car.refuel(50);
        car.refuel(20);
        car.drive(7000);
    }
}
