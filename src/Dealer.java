import java.util.Arrays;
import car.*;
import factory.*;

public class Dealer {
    private String [] options;
    private String [] suvs;
    private String [] sedans;
    private base_car_factory tesla;
    private base_car_factory bmw;

    Dealer () {
        options = new String [] {"ABS", "TCS", "Alarm", "Parkass", "Leather", "Chrome", "Spoiler", "Metallic"};
        suvs = new String [] {"Tesla SUV", "BMW SUV"};
        sedans = new String [] {"Tesla Sedan", "BMW Sedan"};
        
        car_factory baseFactory = new car_factory ();
        tesla = baseFactory.get_car_factory ("Tesla");
        bmw = baseFactory.get_car_factory ("BMW");
    }

    public void showCarModels () {
        System.out.println ("SUVs:");
        for (String suv : suvs) {
            System.out.println (suv);
        }

        System.out.println ("Sedans:");
        for (String sedan : sedans) {
            System.out.println (sedan);
        }
    }

    public void showOptions () {
        System.out.println ("Options: ");
        for (String option : options) {
            System.out.println ("- " + option);
        }
        System.out.println (); // Empty line
    }

    public Car getCar (String car) {
        if (Arrays.asList(suvs).contains(car) || Arrays.asList(sedans).contains(car)) {
            Car newCar = null;
        
            if (car.equalsIgnoreCase ("Tesla SUV")) {
                newCar = tesla.make_car ("SUV", new ElectricEngine());
            }
            else if (car.equalsIgnoreCase ("Tesla Sedan")) {
                newCar = tesla.make_car ("Sedan", new ElectricEngine());
            }
            else if (car.equalsIgnoreCase ("BMW SUV")) {
                newCar = bmw.make_car ("SUV", new PetrolEngine());
            }
            else if (car.equalsIgnoreCase ("BMW Sedan")) {
                newCar = bmw.make_car ("Sedan", new PetrolEngine());
            }

            System.out.println ("Here is your brand new " + car);
            return newCar;
        }
        else {
            System.out.println ("We do not sell this car.");
        }
        return null;
    }

    public Car addOption (Car car, String option) {
        if (Arrays.asList(options).contains(option)) {
            if (car.getBrand ().equalsIgnoreCase ("Tesla")) {
                car = tesla.upgrade_car (car, option);
            }
            else if (car.getBrand ().equalsIgnoreCase ("BMW")) {
                car = bmw.upgrade_car (car, option);
            }
            System.out.println ("Upgraded car with: " + option);
        }
        else {
            System.out.println ("This option does not exist.");    
        }
        return car;
    }
}