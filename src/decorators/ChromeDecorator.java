package decorators;

import car.Car;

public class ChromeDecorator extends CarDecorator {

    public ChromeDecorator(Car car) {
        super(car, "chrome_wheels");
    }
}