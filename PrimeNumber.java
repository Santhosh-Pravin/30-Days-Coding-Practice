import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Number: ");
        int num = input.nextInt();
        
        if (num <= 1) {
            System.out.println("The number " + num + " is Not a Prime number.");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {  // Optimization using sqrt(num)
                if (num % i == 0) {
                    isPrime = false;
                    break;  // Exit loop early if a divisor is found
                }
            }
            
            if (isPrime) {
                System.out.println("The number " + num + " is a Prime number.");
            } else {
                System.out.println("The number " + num + " is Not a Prime number.");
            }
        }
        
        input.close();  // Closing the scanner to prevent resource leaks
    }
}
