package school;

public class Student extends Teacher {
    private int studentID;
    private int grade;

    public Student(String name, String subject, int studentID, int grade) {
        super(name, subject); // Call the constructor of the superclass (Teacher)
        this.studentID = studentID;
        this.grade = grade;
    }

    public int getStudentID() {
        return studentID;
    }

    public int getGrade() {
        return grade;
    }

    public void displayStudentInfo() {
        displayInfo(); // Call the method from the superclass (Teacher)
        System.out.println("Student ID: " + studentID);
        System.out.println("Grade: " + grade);
    }
}
