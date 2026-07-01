import java.util.Scanner;

class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive natural number.");
        } else {
            int formulaSum = (n * (n + 1)) / 2;
            int loopSum = 0;
            int i = 1;

            // Using a while loop to calculate the sum
            while (i <= n) {
                loopSum += i; // Add current value of i to loopSum
                i++; // Increment i for the next iteration
            }

            System.out.println("Sum using the formula: " + formulaSum);
            System.out.println("Sum using the while loop: " + loopSum);

            if (formulaSum == loopSum) {
                System.out.println("Both computations match and are correct!");
            } else {
                System.out.println("There is an error in the computation.");
            }
        }

        input.close(); // Close the scanner to prevent resource leaks
    }
}
