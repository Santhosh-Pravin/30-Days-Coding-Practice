import java.util.Scanner;

class HandshakeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Handshake formula: n * (n - 1) / 2
        int maximumHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Displaying the result
        System.out.println("\n==== Handshake Calculation ====");
        System.out.println("Number of Students: " + numberOfStudents);
        System.out.println("Maximum Handshakes: " + maximumHandshakes);

        input.close(); // Closing the scanner
    }
}
