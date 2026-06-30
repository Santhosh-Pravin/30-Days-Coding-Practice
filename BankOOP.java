class BankAccount {
    String accountNumber;
    String accountHolder;
    int balance;
    // Constructor
    BankAccount(String accountNumber, String accountHolder,  int balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    // Method to display current balance
    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
        System.out.println("----------------------------");
    }
}
// Main class
public class BankOOP {
    public static void main(String[] args) {
        // Creating bank account object
        BankAccount account1 = new BankAccount("1234567890", "Lalith", 69000);
        // Displaying balance
        account1.displayBalance();
    }
}