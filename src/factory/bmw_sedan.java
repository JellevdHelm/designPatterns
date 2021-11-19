package factory;

import car.SedanCar;
import car.Engine;

public class bmw_sedan extends SedanCar {
    public bmw_sedan(Engine motor) {
        this.brand = "bmw";
        this.engine = motor;

        this.description = "Car of brand " + brand + ", with motor " + engine.getName() + " and fuel " + engine.getFuel().getName() + " with extras: ";
    }
}
