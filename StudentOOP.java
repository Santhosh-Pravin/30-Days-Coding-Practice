class Student { //Creating a class called Student 
    int rollNo;
    String name;
    double marks;
    Student(int rollNo, String name, double marks) { // Create Constructer for initializing objects
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    void display() { //Method to display the variables
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println();
    }
}
public class StudentOOP { 
    public static void main(String[] args) {
        Student student1 = new Student(1, "Atulya", 85.5);
        Student student2 = new Student(2, "Coolie", 90.0);
        System.out.println("Student 1 Details:");
        student1.display();
        System.out.println("Student 2 Details:");
        student2.display();
    }
}