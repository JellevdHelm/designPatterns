package factory;

import car.Car;
import car.Engine;

public class bmw_factory extends base_car_factory {

    @Override
    public Car make_car(String type, Engine motor) {
        if (type.equalsIgnoreCase("SUV")) {
            return new bmw_SUV(motor);
        } else if (type.equalsIgnoreCase("SEDAN")) {
            return new bmw_sedan(motor);
        }
        return null;
    }
}
