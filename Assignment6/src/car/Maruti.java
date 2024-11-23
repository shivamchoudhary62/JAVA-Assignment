package car;

public class Maruti extends Car {

    public Maruti(String model) {
        super(model);
    }

    @Override
    public void avg() {
        System.out.println("Maruti " + model + " has an average mileage of 18 km/l.");
    }

    @Override
    public void mode() {
        System.out.println("Maruti " + model + " is available in automatic mode.");
    }
}
