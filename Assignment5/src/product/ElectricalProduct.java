package product;

public class ElectricalProduct extends Product {
    private String voltageRange;
    private int wattage;

    public ElectricalProduct(int productID, String name, int categoryID, double unitPrice, String voltageRange, int wattage) {
        super(productID, name, categoryID, unitPrice);
        this.voltageRange = voltageRange;
        this.wattage = wattage;
    }

    public String getVoltageRange() {
        return voltageRange;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Voltage Range: " + voltageRange);
        System.out.println("Wattage: " + wattage);
    }
}
