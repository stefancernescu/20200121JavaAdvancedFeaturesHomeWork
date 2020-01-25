package vehicle.model;

public abstract class Vehicle {
    private String name;
    private int productYear;

    public Vehicle(String name, int productYear) {
        this.name = name;
        this.productYear = productYear;
    }

    public abstract void buy();
}
