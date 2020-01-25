package vehicle.model;

public class Bike extends Vehicle{

    public Bike(String name, int productYear) {
        super(name, productYear);
    }

    @Override
    public void buy() {
        System.out.println("Bike buy");
    }
}
