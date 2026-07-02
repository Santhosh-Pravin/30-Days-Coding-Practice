import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int factorial = 1;
            int i = 1;

            // Using a while loop to compute the factorial
            while (i <= number) {
                factorial *= i; // Multiply factorial by i
                i++; // Increment i for the next iteration
            }

            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        input.close(); // Close the scanner to prevent resource leaks
    }
}
