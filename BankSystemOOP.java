import java.util.Scanner;
class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }
}
public class BankSystemOOP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of accounts: ");
        int n = input.nextInt();
        Account[] accounts = new Account[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter balance for account " + (i + 1) + ": ");
            int balance = input.nextInt();
            accounts[i] = new Account(balance);
        }
        int total = calculateTotalBalance(accounts);
        System.out.println("Total balance in all accounts: " + total);
    }
    public static int calculateTotalBalance(Account[] accounts) {
        int total = 0;
        for (int i = 0; i < accounts.length; i++) {
            total += accounts[i].getBalance();
        }
        return total;
    }
}