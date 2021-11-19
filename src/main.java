import car.*;

public class main {
    public static void main (String [] args) {
        Dealer dealer = new Dealer ();
        
        dealer.showCarModels ();
        dealer.showOptions ();

        Car myCar = dealer.getCar ("Tesla SUV");
        dealer.getCar ("Bat Mobilé");


        System.out.println ("Test before decorator.");
        System.out.println (myCar.getBrand ());
        System.out.println (myCar.getMotor ().getName());
        System.out.println (myCar.getFuel ().getName());
        System.out.println(myCar.deliverCar());


        System.out.println ("Test after decorator.");
        myCar = dealer.addOption (myCar, "ABS");
        System.out.println (myCar.getBrand ());
        System.out.println (myCar.getMotor ().getName());
        System.out.println (myCar.getFuel ().getName());


        System.out.println ("Add multiple decorators.");
        myCar = dealer.addOption (myCar, "Leather");
        myCar = dealer.addOption (myCar, "TCS");
        myCar = dealer.addOption (myCar, "Spoiler");
        myCar = dealer.addOption (myCar, "Chrome");
        myCar = dealer.addOption (myCar, "Fifth Wheel");
        
        System.out.println (myCar.deliverCar ());

        Car auto = dealer.getCar("BMW Sedan");
        System.out.println(auto.deliverCar());
        auto = dealer.addOption (auto, "Chrome");
        System.out.println(auto.deliverCar());
        auto = dealer.addOption (auto, "ABS");
        System.out.println(auto.deliverCar());
        auto = dealer.addOption (auto, "Spoiler");

        System.out.println (auto.deliverCar ());
    }
}
