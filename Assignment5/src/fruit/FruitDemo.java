package fruit;

public class FruitDemo {
    public static void main(String[] args) {
        Fruit apple = new Fruit("Apple", "Single", 0.5);
        Fruit bananaBunch = new Fruit("Banana", "Bunch", 1.2);

        System.out.println("Fruit 1:");
        apple.displayFruit();
        
        System.out.println("\nFruit 2:");
        bananaBunch.displayFruit();
    }
}
