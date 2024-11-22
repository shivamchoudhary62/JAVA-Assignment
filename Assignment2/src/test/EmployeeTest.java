package test;

import company.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", "Doe", 3000);
        Employee emp2 = new Employee("Jane", "Smith", 3500);

        System.out.println("Employee 1: " + emp1.getName() + " " + emp1.getLastName());
        System.out.println("Yearly Salary: $" + emp1.getYearlySalary());

        System.out.println("Employee 2: " + emp2.getName() + " " + emp2.getLastName());
        System.out.println("Yearly Salary: $" + emp2.getYearlySalary());

        emp1.giveRaise(10);
        emp2.giveRaise(10);

        System.out.println("\nAfter 10% raise:");
        System.out.println("Employee 1: " + emp1.getName() + " " + emp1.getLastName());
        System.out.println("Yearly Salary: $" + emp1.getYearlySalary());

        System.out.println("Employee 2: " + emp2.getName() + " " + emp2.getLastName());
        System.out.println("Yearly Salary: $" + emp2.getYearlySalary());
    }
}
