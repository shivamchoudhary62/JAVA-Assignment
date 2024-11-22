package test;

import store.Invoice;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("12345", "Hammer", 3, 19.99);

        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per Item: " + invoice.getPricePerItem());
        System.out.println("Invoice Amount: $" + invoice.getInvoiceAmount());

        invoice.setQuantity(-5);
        invoice.setPricePerItem(-10.99);
        
        System.out.println("\nAfter setting invalid quantity and price per item:");
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per Item: " + invoice.getPricePerItem());
        System.out.println("Invoice Amount: $" + invoice.getInvoiceAmount());
    }
}
