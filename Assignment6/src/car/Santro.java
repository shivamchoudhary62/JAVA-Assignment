package car;

public class Santro extends Car {

    public Santro(String model) {
        super(model);
    }

    @Override
    public void avg() {
        System.out.println("Santro " + model + " has an average mileage of 20 km/l.");
    }

    @Override
    public void mode() {
        System.out.println("Santro " + model + " is available in manual mode.");
    }
}
