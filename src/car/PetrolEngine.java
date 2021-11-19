package car;

public class PetrolEngine extends Engine{

    public PetrolEngine(){
        super.name = "Petrol engine";
        super.fuel = new Petrol();
    }
}
