import java.util.Scanner;

public class YoungestTallestFriend {

    // Find the youngest friend
    public static String findYoungest(String[] names, int[] ages) {
        int minIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) {
                minIndex = i;
            }
        }
        return names[minIndex];
    }

    // Find the tallest friend
    public static String findTallest(String[] names, double[] heights) {
        int maxIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) {
                maxIndex = i;
            }
        }
        return names[maxIndex];
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Ask user for the number of friends
            System.out.print("Enter the number of friends: ");
            int n = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over after nextInt()

            String[] names = new String[n];
            int[] ages = new int[n];
            double[] heights = new double[n];

            // Collect names, ages, and heights
            for (int i = 0; i < n; i++) {
                System.out.print("Enter name of friend " + (i + 1) + ": ");
                names[i] = scanner.nextLine();

                // Ensure valid age input
                int age = -1;
                while (age <= 0) {
                    System.out.print("Enter age of " + names[i] + ": ");
                    if (scanner.hasNextInt()) {
                        age = scanner.nextInt();
                        if (age <= 0) {
                            System.out.println("Please enter a valid positive age.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a numeric value for age.");
                        scanner.next(); // consume the invalid input
                    }
                }
                ages[i] = age;

                // Ensure valid height input
                double height = -1;
                while (height <= 0) {
                    System.out.print("Enter height of " + names[i] + " in cm: ");
                    if (scanner.hasNextDouble()) {
                        height = scanner.nextDouble();
                        if (height <= 0) {
                            System.out.println("Please enter a valid positive height.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a numeric value for height.");
                        scanner.next(); // consume the invalid input
                    }
                }
                heights[i] = height;
                scanner.nextLine();  // Consume newline left-over after nextDouble()
            }

            // Output the youngest and tallest friends
            System.out.println("Youngest friend: 
