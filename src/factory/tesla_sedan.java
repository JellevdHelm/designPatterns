package factory;

import car.SedanCar;
import car.Engine;

public class tesla_sedan extends SedanCar {

    public tesla_sedan(Engine motor) {
        this.brand = "tesla";
        this.engine = motor;
        this.description = "Car of brand " + brand + ", with motor " + engine.getName() + " and fuel " + engine.getFuel().getName() + " with extras: ";

    }
}
