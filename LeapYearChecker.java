import java.util.Scanner;

public class LeapYearChecker {
    public static boolean isLeapYear(int year) {
        // Simplify the condition to directly return the boolean expression
        return year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {  // Use try-with-resources for closing the scanner
            System.out.print("Enter a year (>= 1582): ");
            int year = scanner.nextInt();
            
            if (year < 1582) {
                System.out.println("Year must be 1582 or later.");
            } else {
                // Output the result using the ternary operator directly
                System.out.println(year + " is " + (isLeapYear(year) ? "a Leap Year" : "not a Leap Year"));
            }
        }  // Scanner will be automatically closed here
    }
}
