package keyworddemo;

public class SuperClass {
    protected String message;

    public SuperClass(String message) {
        this.message = message;
        System.out.println("SuperClass constructor called with message: " + message);
    }

    public void displayMessage() {
        System.out.println("Message from SuperClass: " + message);
    }
}
