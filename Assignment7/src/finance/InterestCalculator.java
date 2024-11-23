package finance;

import java.util.Scanner;

public class InterestCalculator {

    public static double calculateBalance(double principal, double annualInterestRate, int months) {
        double years = months / 12.0;
        double totalInterest = principal * annualInterestRate * years;
        return principal + totalInterest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (as a decimal): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the number of months: ");
        int months = scanner.nextInt();

        double balance = calculateBalance(principal, annualInterestRate, months);
        System.out.printf("The balance at the end of %d months is: $%.2f%n", months, balance);

        scanner.close();
    }
}
