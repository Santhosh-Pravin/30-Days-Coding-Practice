import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int ogNum = input.nextInt();
        
        int tempNum = ogNum;
        int sumNum = 0;
        int numDigits = String.valueOf(ogNum).length(); // Get the number of digits dynamically
        
        while (tempNum > 0) {
            int rem = tempNum % 10;
            sumNum += Math.pow(rem, numDigits); // Raise to the power of digit count
            tempNum /= 10;
        }
        
        if (ogNum == sumNum) {
            System.out.println("The Number " + ogNum + " is an Armstrong Number.");
        } else {
            System.out.println("The Number " + ogNum + " is Not an Armstrong Number.");
        }
        
        input.close(); // Close the scanner to prevent resource leaks
    }
}
