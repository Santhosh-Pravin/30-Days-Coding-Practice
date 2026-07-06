import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = input.nextInt();
        
        if (num == 0) { // Special case for zero
            System.out.println("0 is not a Harshad Number.");
        } else {
            int sum = 0;
            int temp = num;
            
            while (temp > 0) {
                int rem = temp % 10; // Extract last digit
                sum += rem; // Add it to sum
                temp /= 10; // Remove last digit
            }
            
            if (num % sum == 0) {
                System.out.println("The number " + num + " is a Harshad Number.");
            } else {
                System.out.println("The number " + num + " is not a Harshad Number.");
            }
        }
        
        input.close(); // Close scanner
    }
}
