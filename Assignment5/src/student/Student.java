package student;

public class Student {
    private String name;

    public String inputName(String name) {
        this.name = name;
        return this.name;
    }

    public String average(int mark1, int mark2, int mark3) {
        double avg = (mark1 + mark2 + mark3) / 3.0;
        return avg > 50 ? "Passed" : "Failed";
    }

    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
    }
}
