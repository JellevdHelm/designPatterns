package factory;

import car.SUVCar;
import car.Engine;

public class bmw_SUV extends SUVCar {
    public bmw_SUV(Engine motor) {
        this.brand = "bmw";
        this.engine = motor;
        this.description = "Car of brand " + brand + ", with motor " + engine.getName() + " and fuel " + engine.getFuel().getName() + " with extras: ";

    }
}
