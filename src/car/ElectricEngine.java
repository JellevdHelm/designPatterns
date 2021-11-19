package car;

public class ElectricEngine extends Engine{

    public ElectricEngine(){
        super.name = "Electric engine";
        super.fuel = new Electricity();
    }
}
