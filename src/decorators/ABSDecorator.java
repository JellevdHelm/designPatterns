package decorators;

import car.Car;

public class ABSDecorator extends CarDecorator {

    public ABSDecorator(Car car) {
        super(car, "abs");
    }
}
