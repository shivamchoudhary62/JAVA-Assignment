package school;

public class SchoolDemo {
    public static void main(String[] args) {
        Student student = new Student("Alice", "Mathematics", 101, 10);

        System.out.println("Student Information:");
        student.displayStudentInfo();
    }
}
