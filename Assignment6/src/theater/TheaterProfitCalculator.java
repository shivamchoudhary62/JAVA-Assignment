package theater;

public class TheaterProfitCalculator {

    private static final double TICKET_PRICE = 5.0;
    private static final double PERFORMANCE_COST = 20.0;
    private static final double ADDITIONAL_COST_PER_ATTENDEE = 0.5;

    public static double calculateTotalProfit(int attendees) {
        double totalIncome = attendees * TICKET_PRICE;
        double totalCost = PERFORMANCE_COST + (attendees * ADDITIONAL_COST_PER_ATTENDEE);
        return totalIncome - totalCost;
    }
}
