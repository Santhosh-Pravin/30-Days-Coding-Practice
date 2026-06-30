class Employee {
    String name;
    int id;
    double salary;
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: $" + salary);
        System.out.println();
    }
}
public class EmployeeOOP {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Atulya", 101, 50000);
        Employee emp2 = new Employee("Coolie", 102, 60000);
        System.out.println("Details of Employee 1:");
        emp1.displayDetails();
        System.out.println("Details of Employee 2:");
        emp2.displayDetails();
    }
}
