import java.util.Scanner;

class SwapNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input for two numbers
        System.out.print("Enter number1: ");
        int number1 = input.nextInt();
        
        System.out.print("Enter number2: ");
        int number2 = input.nextInt();

        // Swapping the numbers using a temporary variable
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Displaying the swapped numbers
        System.out.println("After swapping: ");
        System.out.println("Number1 = " + number1);
        System.out.println("Number2 = " + number2);

        input.close(); // Closing the scanner to prevent resource leaks
    }
}
