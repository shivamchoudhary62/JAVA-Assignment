package student;

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student();

        String name = student.inputName("John Doe");
        System.out.println("Name entered: " + name);

        String result = student.average(70, 55, 40);
        System.out.println("Average result: " + result);

        student.displayStudentDetails();
    }
}
