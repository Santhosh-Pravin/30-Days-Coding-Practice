class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}

public class EmployeeOOP {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Alice", 45000),
            new Employee("Bob", 56000),
            new Employee("Charlie", 75000),
            new Employee("Diana", 61000)
        };

        Employee highest = employees[0];

        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() > highest.getSalary()) {
                highest = employees[i];
            }
        }

        System.out.println("Highest paid employee: " + highest.getName() + " with salary ₹" + highest.getSalary());
    }
}