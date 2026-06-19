import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator {
    private static String input = "";

    public static void main(String[] args) {
        // Frame setup
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Display field
        JTextField displayField = new JTextField();
        displayField.setEditable(false);
        displayField.setFont(new Font("Arial", Font.BOLD, 24));
        frame.add(displayField, BorderLayout.NORTH);

        // Panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));

        // Buttons text
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        // Create and add buttons
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 20));

            button.addActionListener(e -> {
                String command = e.getActionCommand();

                if (command.equals("C")) {
                    input = "";
                    displayField.setText("");
                } else if (command.equals("=")) {
                    try {
                        double result = evaluateExpression(input);
                        displayField.setText(String.valueOf(result));
                        input = String.valueOf(result);  // Allow chaining calculations
                    } catch (Exception ex) {
                        displayField.setText("Error");
                        input = "";
                    }
                } else {
                    input += command;
                    displayField.setText(input);
                }
            });

            buttonPanel.add(button);
        }

        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    // Simple expression evaluator (handles +, -, *, /)
    private static double evaluateExpression(String expression) {
        // Warning: This is a simple evaluator and does not handle parentheses or operator precedence.
        String[] tokens = expression.split("(?<=[-+*/])|(?=[-+*/])");

        double result = Double.parseDouble(tokens[0]);

        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            double nextNumber = Double.parseDouble(tokens[i + 1]);

            switch (operator) {
                case "+": result += nextNumber; break;
                case "-": result -= nextNumber; break;
                case "*": result *= nextNumber; break;
                case "/": result /= nextNumber; break;
                default: throw new IllegalArgumentException("Invalid operator");
            }
        }

        return result;
    }
}
