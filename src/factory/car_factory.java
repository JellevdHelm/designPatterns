package factory;

public class car_factory {

    public car_factory() {
    }

    public base_car_factory get_car_factory(String string) {
        if (string.equalsIgnoreCase("TESLA")) {
            return new tesla_factory();
        }
        else if(string.equalsIgnoreCase("BMW")){
            return new bmw_factory();
        }
        else{
            System.out.println("deze auto hebben we niet mattie");
        }
        return null;
    }
}
