package factory;

import car.Car;
import car.Engine;

public class tesla_factory extends base_car_factory {

    @Override
    public Car make_car(String type, Engine motor) {
        if (type.equalsIgnoreCase("SUV")) {
            return new tesla_SUV(motor);
        } else if (type.equalsIgnoreCase("SEDAN")) {

            return new tesla_sedan(motor);
        }
        return null;
    }
}
