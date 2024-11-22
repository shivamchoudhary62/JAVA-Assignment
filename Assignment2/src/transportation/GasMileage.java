package transportation;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalMiles = 0;
        double totalGallons = 0;
        
        while (true) {
            System.out.print("Enter miles driven (-1 to quit): ");
            double miles = scanner.nextDouble();
            if (miles == -1) break;

            System.out.print("Enter gallons used: ");
            double gallons = scanner.nextDouble();

            double mpg = miles / gallons;
            totalMiles += miles;
            totalGallons += gallons;

            System.out.printf("Miles per gallon for this trip: %.2f\n", mpg);
        }

        if (totalGallons != 0) {
            double totalMpg = totalMiles / totalGallons;
            System.out.printf("Combined miles per gallon for all trips: %.2f\n", totalMpg);
        } else {
            System.out.println("No data to calculate combined miles per gallon.");
        }

        scanner.close();
    }
}
