package vehicle;

public class Bicycle extends Vehicle {
    private boolean hasBell;

    public Bicycle(String brand, String model, int year, boolean hasBell) {
        super(brand, model, year);
        this.hasBell = hasBell;
    }

    public void ringBell() {
        System.out.println("Bicycle bell is ringing.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Bell: " + (hasBell ? "Yes" : "No"));
    }
}
