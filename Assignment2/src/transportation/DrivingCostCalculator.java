package transportation;

import java.util.Scanner;

public class DrivingCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total miles driven per day: ");
        double milesPerDay = scanner.nextDouble();

        System.out.print("Enter cost per gallon of gasoline: ");
        double costPerGallon = scanner.nextDouble();

        System.out.print("Enter average fees per day (maintenance, parking, etc.): ");
        double feesPerDay = scanner.nextDouble();

        System.out.print("Enter tolls per day: ");
        double tollsPerDay = scanner.nextDouble();

        System.out.print("Enter your car's fuel efficiency (miles per gallon): ");
        double fuelEfficiency = scanner.nextDouble();

        double dailyFuelCost = (milesPerDay / fuelEfficiency) * costPerGallon;
        double totalDailyCost = dailyFuelCost + feesPerDay + tollsPerDay;

        System.out.printf("Your daily driving cost is: $%.2f\n", totalDailyCost);

        scanner.close();
    }
}
