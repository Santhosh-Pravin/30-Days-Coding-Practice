import java.util.Scanner;
class Student {
    String name;
    int[] marks;
    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }
    double getAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }
}
public class StudentMarksTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3]; 
        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = sc.nextLine();
            int[] marks = new int[3]; 
            for (int j = 0; j < marks.length; j++) {
                System.out.print("Enter mark " + (j + 1) + ": ");
                marks[j] = sc.nextInt();
            }
            sc.nextLine(); 
            students[i] = new Student(name, marks);
        }
        Student topStudent = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getAverage() > topStudent.getAverage()) {
                topStudent = students[i];
            }
        }
        System.out.println("\nTop student: " + topStudent.name);
        System.out.println("Average marks: " + topStudent.getAverage());
        sc.close();
    }
}
