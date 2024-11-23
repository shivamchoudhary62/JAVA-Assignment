package vehicle;

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2020, 4);
        Bicycle bicycle = new Bicycle("Giant", "Escape 3", 2021, true);
        Scooter scooter = new Scooter("Xiaomi", "M365", 2019, 7800);

        System.out.println("Car Info:");
        car.displayInfo();
        car.start();
        car.honk();
        car.stop();

        System.out.println("\nBicycle Info:");
        bicycle.displayInfo();
        bicycle.start();
        bicycle.ringBell();
        bicycle.stop();

        System.out.println("\nScooter Info:");
        scooter.displayInfo();
        scooter.start();
        scooter.chargeBattery();
        scooter.stop();
    }
}
