import java.util.Random;
import java.util.Scanner;

public class RandomNumbersAnalysis {

    // Generate an array of random 4-digit numbers
    public static int[] generate4DigitRandomArray(int size) {
        Random random = new Random();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + random.nextInt(9000);  // Random 4-digit number
        }
        return numbers;
    }

    // Find the average, minimum, and maximum values of an array
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get array size from user
        System.out.print("Enter the number of random numbers to generate: ");
        int size = scanner.nextInt();
        
        int[] numbers = generate4DigitRandomArray(size);
        double[] results = findAverageMinMax(numbers);
        
        // Display the generated numbers
        System.out.print("Generated numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        
        // Display the analysis results with formatted average
        System.out.printf("\nAverage: %.2f\n", results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
        
        scanner.close();
    }
}
