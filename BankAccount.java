// Modifiers 
public class BankAccount {
    private String accountHolder;         // private: only inside class
    private double balance;
    public static String bankName = "ABC Bank";  // static: common for all accounts
    public final String IFSC_CODE = "ABC000123"; // final: constant value

    // Constructor
    public BankAccount(String holder, double amount) {
        this.accountHolder = holder;
        this.balance = amount;
    }

    // public method to access private data
    public void displayInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("Bank: " + bankName);
        System.out.println("IFSC: " + IFSC_CODE);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("John", 10000);
        acc.displayInfo();
    }
}
