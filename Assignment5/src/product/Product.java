package product;

public class Product {
    private int productID;
    private String name;
    private int categoryID;
    private double unitPrice;

    public Product(int productID, String name, int categoryID, double unitPrice) {
        this.productID = productID;
        this.name = name;
        this.categoryID = categoryID;
        this.unitPrice = unitPrice;
    }

    public int getProductID() {
        return productID;
    }

    public String getName() {
        return name;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void displayProductDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Name: " + name);
        System.out.println("Category ID: " + categoryID);
        System.out.println("Unit Price: " + unitPrice);
    }
}
