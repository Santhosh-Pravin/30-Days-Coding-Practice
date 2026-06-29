import java.util.Scanner;

class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the rate of interest (in % per year): ");
        double rate = input.nextDouble();

        System.out.print("Enter the time period (in years): ");
        double time = input.nextDouble();

        // Calculating Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Displaying the result
        System.out.println("\n==== Simple Interest Calculation ====");
        System.out.printf("Principal Amount: INR %.2f%n", principal);
        System.out.printf("Rate of Interest: %.2f%%%n", rate);
        System.out.printf("Time Period: %.2f years%n", time);
        System.out.printf("Simple Interest: INR %.2f%n", simpleInterest);

        input.close(); // Closing the scanner
    }
}
