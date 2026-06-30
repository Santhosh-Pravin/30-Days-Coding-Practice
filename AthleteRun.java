import java.util.Scanner;

class AthleteRun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for the three sides of the track
        System.out.print("Enter the length of side1 (in meters): ");
        double side1 = input.nextDouble();

        System.out.print("Enter the length of side2 (in meters): ");
        double side2 = input.nextDouble();

        System.out.print("Enter the length of side3 (in meters): ");
        double side3 = input.nextDouble();

        // Calculating perimeter of the triangular track
        double perimeter = side1 + side2 + side3;
        double totalDistanceInMeters = 5000; // 5 km in meters

        // Calculating the number of rounds needed to complete 5 km
        double rounds = totalDistanceInMeters / perimeter;

        // Displaying the result
        System.out.println("The total number of rounds the athlete will run is " + rounds);

        input.close(); // Closing the scanner
    }
}
