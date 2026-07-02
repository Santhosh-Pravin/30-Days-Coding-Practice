import java.util.Scanner;

class FactorialAgain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int factorial = 1;
            // Using a for loop to compute the factorial
            for (int i = 1; i <= number; i++) {
                factorial *= i; // Multiply factorial by i
            }
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        input.close(); // Close the scanner to prevent resource leaks
    }
}
