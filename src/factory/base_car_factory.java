package factory;

import car.Car;
import car.Engine;
import decorators.*;

public abstract class base_car_factory {

    public abstract Car make_car(String type, Engine motor);

    public Car upgrade_car(Car car, String string) { //The cake is a lie.
        if (string.equalsIgnoreCase("ABS")) {
            return new ABSDecorator(car);
        } else if (string.equalsIgnoreCase("ALARM")) {
            return new AlarmDecorator(car);
        } else if (string.equalsIgnoreCase("CHROME")) {
            return new ChromeDecorator(car);
        } else if (string.equalsIgnoreCase("LEATHER")) {
            return new LeatherDecorator(car);
        } else if (string.equalsIgnoreCase("METALLIC")) {
            return new MetallicDecorator(car);
        } else if (string.equalsIgnoreCase("PARKASS")) {
            return new ParkAssDecorator(car);
        } else if (string.equalsIgnoreCase("SPOILER")) {
            return new SpoilerDecorator(car);
        } else if (string.equalsIgnoreCase("TCS")) {
            return new TCSDecorator(car);
        }
        System.out.println("Decorator not found");
        return car;
    }

}
