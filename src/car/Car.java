package car;

public abstract class Car {
    protected String description;

    protected String brand;
    protected Engine engine;

    public String getDescription() {
        return description;
    }

    public String getBrand() {
        return brand;
    }

    public Engine getMotor() {
        return engine;
    }

    public void setMotor(Engine engine) {
        this.engine = engine;
    }

    public Fuel getFuel() {
        return engine.fuel;
    }

    public void setFuel(Fuel fuel){
        this.engine.fuel = fuel;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String deliverCar() {
        return description;
    }
}
