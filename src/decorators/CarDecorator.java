package decorators;

import car.Car;

public abstract class CarDecorator extends Car {

    protected Car car;
    protected String name;

    public CarDecorator(Car car, String name) {
        this.description = car.getDescription();
        this.brand = car.getBrand();
        this.engine = car.getMotor();
        //this.fuel = car.getFuel();
        this.name = name;
        this.car = car;
        //car.setFuel(null);
        car.setBrand(null);
        //car.setDescription(null);
        car.setMotor(null);
    }

    public String deliverCar() {
        return car.deliverCar() + name + ", ";
    }
}
