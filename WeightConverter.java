import java.util.Scanner;

class WeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the weight in pounds: ");
        double pounds = input.nextDouble();

        // Correct conversion factor: 1 pound = 0.453592 kilograms
        double kilograms = pounds * 0.453592;

        // Displaying the result
        System.out.println("\n==== Weight Conversion ====");
        System.out.printf("%.2f pounds is equal to %.2f kilograms.%n", pounds, kilograms);

        input.close(); // Closing scanner
    }
}
