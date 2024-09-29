public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = Math.max(quantity, 0); 
        this.pricePerItem = Math.max(pricePerItem, 0.0);
    }

     public double getInvoiceAmount() {
        return quantity * pricePerItem;    }
    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }
    public static void main(String[] args) {
        Invoice invoice = new Invoice("A001", "Widget", 5, 19.99);

        // Display invoice details
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per Item: $" + invoice.getPricePerItem());
        System.out.println("Invoice Amount: $" + invoice.getInvoiceAmount());
    }
}