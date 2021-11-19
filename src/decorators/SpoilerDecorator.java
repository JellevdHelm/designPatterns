package decorators;

import car.Car;

public class SpoilerDecorator extends CarDecorator{
    public SpoilerDecorator(Car car){
        super(car, "spoiler");
    }
}