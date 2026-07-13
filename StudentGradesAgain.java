import java.util.Scanner;

public class StudentGradesAgain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        double[][] marks = new double[numberOfStudents][3];
        double[][] results = new double[numberOfStudents][2];
        char[] grades = new char[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            double totalMarks = 0;
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                double mark;
                do {
                    System.out.print(subject + " marks: ");
                    mark = scanner.nextDouble();
                    if (mark < 0 || mark > 100) {
                        System.out.println("Please enter a valid mark between 0 and 100.");
                    }
                } while (mark < 0 || mark > 100);
                marks[i][j] = mark;
                totalMarks += mark;
            }
            double percentage = totalMarks / 3;
            results[i][0] = percentage;
            if (percentage >= 80) {
                grades[i] = 'A';
            } else if (percentage >= 60) {
                grades[i] = 'B';
            } else if (percentage >= 40) {
                grades[i] = 'C';
            } else {
                grades[i] = 'D';
            }
        }
        System.out.println("\nStudent Results:");
        System.out.println("Student | Physics | Chemistry | Maths | Percentage | Grade");
        System.out.println("--------------------------------------------------------------");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%8d | %7.2f | %9.2f | %5.2f | %10.2f | %5c%n", i + 1, marks[i][0], marks[i][1], marks[i][2], results[i][0], grades[i]);
        }
        scanner.close();
    }
}
