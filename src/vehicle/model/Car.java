package vehicle.model;

public class Car extends Vehicle {

    public Car(String name, int productYear) {
        super(name, productYear);
    }

    @Override
    public void buy() {
        System.out.println("Person is buying a car");
    }
}
