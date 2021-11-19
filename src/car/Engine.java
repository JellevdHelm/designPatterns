package car;

public abstract class Engine {
    protected Fuel fuel;
    protected String name;

    public String getName() {
        return this.name;
    }

    public Fuel getFuel() {
        return fuel;
    }
}
