import java.util.Scanner;

class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0.0;
        double num;

        // Loop until the user enters 0
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            num = input.nextDouble();
            if (num == 0) {
                break; // Exit the loop when the user enters 0
            }
            total += num; // Add the entered number to the total
        }

        System.out.println("The total sum is: " + total);
        input.close();
    }
}
