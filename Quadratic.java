import java.util.Scanner;

public class Quadratic {
    
    // Method to find the roots of the quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};  // Two real roots
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};  // One real root
        }
        return new double[]{};  // No real roots
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input validation for coefficient 'a'
        double a = 0;
        while (a == 0) {
            System.out.print("Enter coefficient a (must not be 0): ");
            if (scanner.hasNextDouble()) {
                a = scanner.nextDouble();
                if (a == 0) {
                    System.out.println("Coefficient 'a' cannot be zero. Please enter a non-zero value.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric value for coefficient a.");
                scanner.next();  // Consume invalid input
            }
        }

        // Input for coefficient 'b'
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        // Input for coefficient 'c'
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Find the roots
        double[] roots = findRoots(a, b, c);

        // Display results
        if (roots.length == 2) {
            System.out.printf("Roots are: %.2f and %.2f\n", roots[0], roots[1]);
        } else if (roots.length == 1) {
            System.out.printf("Root is: %.2f\n", roots[0]);
        } else {
            System.out.println("No real roots");
        }

        scanner.close();
    }
}
