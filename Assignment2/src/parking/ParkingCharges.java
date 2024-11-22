package parking;

import java.util.Scanner;

public class ParkingCharges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter hours parked (-1 to quit): ");
            int hours = scanner.nextInt();
            if (hours == -1) break;

            double charge = calculateCharges(hours);
            System.out.printf("Parking charge: $%.2f\n", charge);
        }

        scanner.close();
    }

    public static double calculateCharges(int hours) {
        if (hours <= 3) {
            return 2.00;
        } else if (hours <= 24) {
            double additionalHours = hours - 3;
            double charge = 2.00 + (additionalHours * 0.50);
            return Math.min(charge, 10.00);
        } else {
            return 10.00; // As we assume no car parks longer than 24 hours
        }
    }
}
