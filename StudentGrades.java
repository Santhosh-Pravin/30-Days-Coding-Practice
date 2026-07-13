import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] math = new int[n];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");

            physics[i] = getValidMarks(scanner, "Physics");
            chemistry[i] = getValidMarks(scanner, "Chemistry");
            math[i] = getValidMarks(scanner, "Math");

            percentage[i] = (physics[i] + chemistry[i] + math[i]) / 3.0;
            grade[i] = getGrade(percentage[i]);
        }

        System.out.println("\nStudent Report:");
        System.out.println("------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-15s %-10s%n", "Physics", "Chemistry", "Math", "Percentage", "Grade");
        System.out.println("------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-10d %-10d %-15.2f %-10s%n", physics[i], chemistry[i], math[i], percentage[i], grade[i]);
        }

        scanner.close();
    }

    public static int getValidMarks(Scanner scanner, String subject) {
        int marks;
        while (true) {
            System.out.print(subject + " marks (0-100): ");
            marks = scanner.nextInt();
            if (marks >= 0 && marks <= 100) {
                return marks;
            }
            System.out.println("Invalid marks! Please enter a value between 0 and 100.");
        }
    }

    public static String getGrade(double percentage) {
        if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "R";
    }
}
