package company;

public class Employee {
    private String name;
    private String lastName;
    private double monthlySalary;

    public Employee(String name, String lastName, double monthlySalary) {
        this.name = name;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary > 0 ? monthlySalary : 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public void giveRaise(double percentage) {
        if (percentage > 0) {
            this.monthlySalary += this.monthlySalary * percentage / 100;
        }
    }
}
