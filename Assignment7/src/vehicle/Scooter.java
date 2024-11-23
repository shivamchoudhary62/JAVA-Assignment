package vehicle;

public class Scooter extends Vehicle {
    private int batteryCapacity;

    public Scooter(String brand, String model, int year, int batteryCapacity) {
        super(brand, model, year);
        this.batteryCapacity = batteryCapacity;
    }

    public void chargeBattery() {
        System.out.println("Scooter battery is charging.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " mAh");
    }
}
