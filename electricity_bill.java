import java.util.Scanner;

class ElectricityBill {
    private double unitsConsumed;
    private String connectionType;
   public ElectricityBill(double unitsConsumed, String connectionType) {
        this.unitsConsumed = unitsConsumed;
        this.connectionType = connectionType;
    }
    public double computeBill() {
        double rate = connectionType.equalsIgnoreCase("domestic") ? 5.0 : 8.0;
        return unitsConsumed * rate;
    }
    public void displayBill() {
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Connection Type: " + connectionType);
        System.out.println("Total Bill Amount: " + computeBill());
    }
}
public class ElectricityBillApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Units Consumed: ");
        double unitsConsumed = scanner.nextDouble();
        System.out.print("Enter Connection Type (domestic/commercial): ");
        String connectionType = scanner.next();
        ElectricityBill bill = new ElectricityBill(unitsConsumed, connectionType);
        bill.displayBill();
        scanner.close();
    }
}