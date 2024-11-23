package fruit;

public class Fruit {
    private String name;
    private String type; // "Single" or "Bunch"
    private double price;

    public Fruit(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public void displayFruit() {
        System.out.println("Fruit Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Price: $" + price);
    }
}
