package finance;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter account number (or -1 to quit): ");
            int accountNumber = scanner.nextInt();
            if (accountNumber == -1) break;
            
            System.out.print("Enter balance at the beginning of the month: ");
            double beginningBalance = scanner.nextDouble();
            
            System.out.print("Enter total of all items charged this month: ");
            double totalCharges = scanner.nextDouble();
            
            System.out.print("Enter total of all credits applied this month: ");
            double totalCredits = scanner.nextDouble();
            
            System.out.print("Enter allowed credit limit: ");
            double creditLimit = scanner.nextDouble();
            
            double newBalance = beginningBalance + totalCharges - totalCredits;
            
            System.out.printf("New balance: $%.2f\n", newBalance);
            
            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded.");
            } else {
                System.out.println("Credit limit not exceeded.");
            }
        }

        scanner.close();
    }
}
