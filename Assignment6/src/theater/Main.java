package theater;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of attendees: ");
        int attendees = scanner.nextInt();

        double totalProfit = TheaterProfitCalculator.calculateTotalProfit(attendees);
        System.out.printf("The total profit for the show is: $%.2f%n", totalProfit);

        scanner.close();
    }
}
