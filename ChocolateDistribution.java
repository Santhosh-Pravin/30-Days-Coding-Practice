import java.util.Scanner;

class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for chocolates and children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();

        // Checking if division by zero occurs
        if (numberOfChildren == 0) {
            System.out.println("Number of children cannot be zero!");
        } else {
            // Calculating chocolates per child and remaining chocolates
            int chocolatesPerChild = numberOfChocolates / numberOfChildren;
            int remainingChocolates = numberOfChocolates % numberOfChildren;

            // Displaying the result
            System.out.println("Each child gets " + chocolatesPerChild + " chocolates.");
            System.out.println("Remaining chocolates: " + remainingChocolates);
        }

        input.close(); // Closing the scanner
    }
}
