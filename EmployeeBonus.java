import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] salary = new double[10];
        int[] yearsOfService = new int[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            boolean validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Enter the salary for employee " + (i + 1) + ": ");
                    salary[i] = scanner.nextDouble();
                    System.out.print("Enter the years of service for employee " + (i + 1) + ": ");
                    yearsOfService[i] = scanner.nextInt();
                    if (salary[i] <= 0 || yearsOfService[i] < 0) {
                        System.out.println("Invalid input. Salary must be positive and years of service must be non-negative.");
                        scanner.nextLine();
                        continue;
                    }
                    validInput = true;
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter valid numbers.");
                    scanner.nextLine();
                }
            }
            totalOldSalary += salary[i];
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\nSummary of Employee Bonus:");
        System.out.println("Total Bonus Payout: $" + totalBonus);
        System.out.println("Total Old Salary: $" + totalOldSalary);
        System.out.println("Total New Salary: $" + totalNewSalary);

        scanner.close();
    }
}