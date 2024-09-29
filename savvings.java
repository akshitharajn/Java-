public class SavingsAccount {
    private static double annual;
    private double savings;
    public SavingsAccount(double balance) {
        savings = balance;
    }
    public void CMI() {
        savings += (savings * annual) / 12;
    }
    public static void setIR(double rate) {
        annual = rate;
    }
    public double getBalance() {
        return savings;
    }
    public static void main(String[] args) {
        SavingsAccount.setIR(0.04);
        SavingsAccount s1 = new SavingsAccount(2000);
        SavingsAccount s2 = new SavingsAccount(3000);
        s1.CMI();
        s2.CMI();
        System.out.println("Saver 1 Balance: " + s1.getBalance());
        System.out.println("Saver 2 Balance: " + s2.getBalance());
        SavingsAccount.setIR(0.05);
        s1.CMI();
        s2.CMI();
        System.out.println("Saver 1 Balance after new rate: " + s1.getBalance());
        System.out.println("Saver 2 Balance after new rate: " + s2.getBalance());
    }
}