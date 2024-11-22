package test;

import utilities.Date;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(12, 25, 2024);

        System.out.println("Initial date:");
        date.displayDate();

        date.setMonth(11);
        date.setDay(15);
        date.setYear(2025);

        System.out.println("Updated date:");
        date.displayDate();
    }
}
