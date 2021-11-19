package factory;

import car.Engine;
import car.SUVCar;

public class tesla_SUV extends SUVCar {

    public tesla_SUV(Engine motor) {
        this.brand = "tesla";
        this.engine = motor;
        this.description = "Car of brand " + brand + ", with motor " + engine.getName() + " and fuel " + engine.getFuel().getName() + " with extras: ";

    }
}
