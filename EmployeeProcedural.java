public class EmployeeProcedural {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Cahan", "Diana"};
        double[] salaries = {45000, 56000, 92000, 61000};

        double maxSalary = salaries[0];
        String highestPaid = names[0];

        for (int i = 1; i < salaries.length; i++) {
            if (salaries[i] > maxSalary) {
                maxSalary = salaries[i];
                highestPaid = names[i];
            }
        }

        System.out.println("Highest paid employee: " + highestPaid + " with salary ₹" + maxSalary);
    }
}