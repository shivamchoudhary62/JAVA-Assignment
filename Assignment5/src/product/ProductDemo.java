package product;

public class ProductDemo {
    public static void main(String[] args) {
        ElectricalProduct eProduct = new ElectricalProduct(101, "Electric Kettle", 5, 29.99, "220-240V", 1500);
        
        System.out.println("Original Electrical Product Details:");
        eProduct.displayProductDetails();

        eProduct.setWattage(1800);
        eProduct.setUnitPrice(34.99);
        
        System.out.println("\nUpdated Electrical Product Details:");
        eProduct.displayProductDetails();
    }
}
