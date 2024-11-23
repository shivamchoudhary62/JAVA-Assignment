package tax;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of hours worked: ");
        int hoursWorked = scanner.nextInt();

        double netPay = TaxCalculator.calculateNetPay(hoursWorked);
        double grossPay = hoursWorked * TaxCalculator.HOURLY_RATE;
        double tax = TaxCalculator.calculateTax(grossPay);

        System.out.printf("Gross Pay: $%.2f\n", grossPay);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Net Pay: $%.2f\n", netPay);

        scanner.close();
    }
}
