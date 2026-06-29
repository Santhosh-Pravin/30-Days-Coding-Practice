import java.util.Scanner;

class IncomeCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input for salary
        System.out.print("Enter salary in INR: ");
        double salary = input.nextDouble();

        // Taking input for bonus
        System.out.print("Enter bonus in INR: ");
        double bonus = input.nextDouble();

        // Calculating total income
        double totalIncome = salary + bonus;

        // Displaying the output
        System.out.println("The salary is INR " + salary + " and the bonus is INR " + bonus + 
                           ". Hence, the Total Income is INR " + totalIncome + ".");

        input.close(); // Closing the scanner to prevent resource leaks
    }
}
