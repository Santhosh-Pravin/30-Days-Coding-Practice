import java.util.Scanner;

class Calculator {
    public static void main(String args[]) {
        float number1, number2;
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter number 1: ");
        number1 = input.nextFloat();
        System.out.print("Enter number 2: ");
        number2 = input.nextFloat();

        // Performing calculations
        float addition = number1 + number2;
        float subtraction = number1 - number2;
        float multiplication = number1 * number2;

        // Handling division by zero
        float division = (number2 != 0) ? (number1 / number2) : Float.POSITIVE_INFINITY;

        // Displaying the result
        System.out.println("\n===== Calculator Results =====");
        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        if (number2 != 0) {
            System.out.println("Division: " + division);
        } else {
            System.out.println("Division: Undefined (Cannot divide by zero)");
        }

        input.close(); // Closing scanner
    }
}
