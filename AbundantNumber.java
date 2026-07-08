import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = input.nextInt();
        
        int divSum = 0;
        for (int i = 1; i < num; i++) { // Loop from 1 to num-1
            if (num % i == 0) {
                divSum += i; // Sum of divisors
            }
        }
        
        if (divSum > num) {
            System.out.println("The number " + num + " is an Abundant Number.");
        } else {
            System.out.println("The number " + num + " is not an Abundant Number.");
        }
        
        input.close(); // Close scanner
    }
}
