import java.util.Scanner;

public class NumberAnalysis {
    // Check if the number is positive
    public static boolean isPositive(int num) {
        return num >= 0;
    }
    
    // Check if the number is even
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
    
    // Compare two numbers
    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        if (num1 < num2) return -1;
        return 0;
    }

    public static void main(String[] args) {
        // Using try-with-resources to automatically close scanner
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numbers = new int[5];

            // Collect numbers with input validation
            for (int i = 0; i < 5; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    scanner.next(); // Consume invalid input
                    System.out.print("Enter number " + (i + 1) + ": ");
                }
                numbers[i] = scanner.nextInt();
            }

            // Process each number to check if positive, even or odd
            for (int num : numbers) {
                if (isPositive(num)) {
                    System.out.println(num + " is positive and " + (isEven(num) ? "even" : "odd"));
                } else {
                    System.out.println(num + " is negative");
                }
            }

            // Compare the first and last number
            int result = compare(numbers[0], numbers[4]);
            if (result == 1) {
                System.out.println("First number is greater than the last number");
            } else if (result == -1) {
                System.out.println("First number is less than the last number");
            } else {
                System.out.println("First number is equal to the last number");
            }
        }  // Scanner is automatically closed here
    }
}

