package decorators;

import car.Car;

public class TCSDecorator extends CarDecorator {
    public TCSDecorator(Car car) {
        super(car, "tcs");
    }
}
