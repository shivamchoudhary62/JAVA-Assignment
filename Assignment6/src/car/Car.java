package car;

public abstract class Car {
    protected String model;

    public Car(String model) {
        this.model = model;
    }

    public void displayModel() {
        System.out.println("Car Model: " + model);
    }

    public abstract void avg();
    public abstract void mode();
}
