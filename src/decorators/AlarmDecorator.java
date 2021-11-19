package decorators;

import car.Car;

public class AlarmDecorator extends CarDecorator {
    public AlarmDecorator(Car car) {
        super(car, "alarm");
    }
}