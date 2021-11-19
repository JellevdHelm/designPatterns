package decorators;

import car.Car;

public class MetallicDecorator extends CarDecorator {
    public MetallicDecorator(Car car) {
        super(car, "metallic_paint");
    }
}