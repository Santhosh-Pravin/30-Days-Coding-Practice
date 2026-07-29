import java.util.Scanner;

public class StudentVoteChecker {
    
    // Check if a student can vote based on their age
    public static boolean canStudentVote(int age) {
        if (age < 0) return false;  // Negative age is not valid
        return age >= 18;  // Student can vote if age is 18 or older
    }

    public static void main(String[] args) {
        // Use try-with-resources for automatic closing of the Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            int[] ages = new int[10];

            // Input ages for 10 students
            for (int i = 0; i < 10; i++) {
                // Keep asking for a valid age if the user enters a negative number
                int age = -1;
                while (age < 0) {
                    System.out.print("Enter age of student " + (i + 1) + ": ");
                    age = scanner.nextInt();
                    if (age < 0) {
                        System.out.println("Age cannot be negative. Please enter a valid age.");
                    }
                }
                ages[i] = age;
            }

            // Output whether each student can vote or not
            for (int i = 0; i < 10; i++) {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") " +
                        (canStudentVote(ages[i]) ? "can vote" : "cannot vote"));
            }
        }  // Scanner will be automatically closed here
    }
}
