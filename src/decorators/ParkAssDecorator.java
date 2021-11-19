package decorators;

import car.Car;

public class ParkAssDecorator extends CarDecorator {
    public ParkAssDecorator(Car car) {
        super(car, "parkassist");
    }
}