package tax;

public class TaxCalculator {

    private static final double TAX_RATE = 0.15;
    static final double HOURLY_RATE = 12.0;

    public static double calculateTax(double grossPay) {
        return grossPay * TAX_RATE;
    }

    public static double calculateNetPay(int hoursWorked) {
        double grossPay = hoursWorked * HOURLY_RATE;
        double tax = calculateTax(grossPay);
        return grossPay - tax;
    }
}
