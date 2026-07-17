import java.util.Scanner;

public class RunningRoundsCalculator {

    public static int calculateRounds(double perimeter) { 
        double distance = 5000;
        return (int) Math.ceil(distance / perimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side 1 (in meters): "); 
        double side1 = scanner.nextDouble();
        System.out.print("Enter the length of side 2 (in meters): "); 
        double side2 = scanner.nextDouble();
        System.out.print("Enter the length of side 3 (in meters): "); 
        double side3 = scanner.nextDouble();

        double perimeter = side1 + side2 + side3;

        if (perimeter <= 0) {
            System.out.println("Invalid input. The sides must be positive numbers.");
        } else {
            int rounds = calculateRounds(perimeter);
            System.out.println("The athlete needs to complete " + rounds + " rounds to run 5 km.");
        }

        scanner.close();
    }
}
