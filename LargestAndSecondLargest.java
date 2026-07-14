import java.util.Scanner;

public class LargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        final int MAX_DIGITS = 10;
        int[] digits = new int[MAX_DIGITS];
        int index = 0;
        while (number != 0) {
            digits[index] = number % 10;
            number /= 10;
            index++;
            if (index == MAX_DIGITS) {
                break;
            }
        }
        scanner.close();
        int largest = -1;
        int secondLargest = -1;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] < largest) {
                secondLargest = digits[i];
            }
        }
        if (largest != -1) {
            System.out.println("Largest digit: " + largest);
            if (secondLargest != -1) {
                System.out.println("Second largest digit: " + secondLargest);
            } else {
                System.out.println("There is no second largest digit.");
            }
        } else {
            System.out.println("No digits found.");
        }
    }
}
