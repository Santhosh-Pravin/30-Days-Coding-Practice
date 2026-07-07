import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number 1: ");
        double first = input.nextDouble();
        
        System.out.print("Enter number 2: ");
        double second = input.nextDouble();
        
        System.out.print("Enter operator (+, -, *, x, /): ");
        String op = input.next();
        
        switch (op) {
            case "+":
                System.out.println("Addition: " + (first + second));
                break;
            case "-":
                System.out.println("Subtraction: " + (first - second));
                break;
            case "*":
            case "x":  // Handle both '*' and 'x'
                System.out.println("Multiplication: " + (first * second));
                break;
            case "/":
                if (second == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    System.out.println("Division: " + (first / second));
                }
                break;
            default:
                System.out.println("Invalid Operator.");
                break;
        }
        
        input.close(); // Close scanner
    }
}
