import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking employee salary input
        System.out.print("Enter the employee's salary: ");
        double salary = input.nextDouble();
        
        // Taking years of service input
        System.out.print("Enter the employee's years of service: ");
        int yearsOfService = input.nextInt();

        // Checking if years of service > 5 for bonus eligibility
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("The bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus for employees with 5 or fewer years of service.");
        }

        input.close(); // Closing scanner to prevent resource leaks
    }
}
