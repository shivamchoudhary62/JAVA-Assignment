package keyworddemo;

public class SubClass extends SuperClass {
    private String additionalMessage;

    public SubClass(String message, String additionalMessage) {
        super(message); // Calling superclass constructor
        this.additionalMessage = additionalMessage;
        System.out.println("SubClass constructor called with additional message: " + additionalMessage);
    }

    public void displayMessage() {
        super.displayMessage(); // Calling superclass method
        System.out.println("Additional message from SubClass: " + additionalMessage);
    }
}
