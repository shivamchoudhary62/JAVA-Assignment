package app;

import operations.AbstractCalculator;
import java.util.Scanner;

public class Calculator extends AbstractCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();

        Calculator calculator = new Calculator();

        int sum = calculator.sum(num1, num2, num3);
        double average = calculator.average(num1, num2, num3);
        int product = calculator.product(num1, num2, num3);
        int largest = calculator.largest(num1, num2, num3);
        int smallest = calculator.smallest(num1, num2, num3);

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Product: " + product);
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);

        scanner.close();
    }
}
