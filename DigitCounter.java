import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = input.nextInt();
        
        // Handle the case where num is 0
        if (num == 0) {
            System.out.println("The no of Digits: 1");
        } else {
            int count = 0;
            while (num > 0) {
                count += 1;
                num /= 10; // Correct way to remove the last digit
            }
            System.out.println("The no of Digits: " + count);
        }
        
        input.close(); // Close the scanner to prevent resource leaks
    }
}
