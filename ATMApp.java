import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ATMApp {
    private static final String CORRECT_PIN = "1234";  // Predefined correct PIN
    private static int balance = 1000;  // Example balance

    public static void main(String[] args) {
        // Main Frame
        JFrame frame = new JFrame("ATM Application");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // PIN Label & Field
        JLabel pinLabel = new JLabel("Enter PIN:");
        JPasswordField pinField = new JPasswordField(10);
        JButton loginButton = new JButton("Login");

        // Add components to frame
        frame.add(pinLabel);
        frame.add(pinField);
        frame.add(loginButton);

        // Panel to hold option buttons (initially hidden)
        JPanel optionsPanel = new JPanel();
        optionsPanel.setLayout(new GridLayout(3, 1, 10, 10));
        optionsPanel.setVisible(false);

        JButton checkBalanceButton = new JButton("Check Balance");
        JButton depositButton = new JButton("Deposit");
        JButton withdrawButton = new JButton("Withdraw");

        optionsPanel.add(checkBalanceButton);
        optionsPanel.add(depositButton);
        optionsPanel.add(withdrawButton);

        frame.add(optionsPanel);

        // Login Button Action
        loginButton.addActionListener(e -> {
            String enteredPin = new String(pinField.getPassword());

            if (enteredPin.equals(CORRECT_PIN)) {
                JOptionPane.showMessageDialog(frame, "Login Successful!");
                optionsPanel.setVisible(true);
                pinField.setEditable(false);
                loginButton.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(frame, "Incorrect PIN. Try again.");
            }
        });

        // Check Balance Button Action
        checkBalanceButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Current Balance: $" + balance);
        });

        // Deposit Button Action
        depositButton.addActionListener(e -> {
            String amountStr = JOptionPane.showInputDialog(frame, "Enter deposit amount:");
            try {
                int amount = Integer.parseInt(amountStr);
                if (amount > 0) {
                    balance += amount;
                    JOptionPane.showMessageDialog(frame, "Deposited $" + amount + " successfully.");
                } else {
                    JOptionPane.showMessageDialog(frame, "Enter a valid amount.");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Invalid input!");
            }
        });

        // Withdraw Button Action
        withdrawButton.addActionListener(e -> {
            String amountStr = JOptionPane.showInputDialog(frame, "Enter withdrawal amount:");
            try {
                int amount = Integer.parseInt(amountStr);
                if (amount > 0 && amount <= balance) {
                    balance -= amount;
                    JOptionPane.showMessageDialog(frame, "Withdrawn $" + amount + " successfully.");
                } else {
                    JOptionPane.showMessageDialog(frame, "Insufficient balance or invalid amount.");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Invalid input!");
            }
        });

        frame.setVisible(true);
    }
}
