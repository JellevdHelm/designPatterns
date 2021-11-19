package decorators;

import car.Car;

public class LeatherDecorator extends CarDecorator {
    public LeatherDecorator(Car car) {
        super(car, "leather_seats");
    }
}