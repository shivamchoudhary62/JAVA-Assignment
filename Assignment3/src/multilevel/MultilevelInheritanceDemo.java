package multilevel;

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Z obj = new Z(10, 5);

        int sum = obj.finalSum();
        int product = obj.findProduct();
        int difference = obj.findDifference();

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Difference: " + difference);
    }
}
