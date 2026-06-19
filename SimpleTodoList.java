import java.util.*;

// Simple Node class
class TaskNode {
    String task;
    TaskNode next;
    
    public TaskNode(String task) {
        this.task = task;
        this.next = null;
    }
}

public class SimpleTodoList {
    private TaskNode head;

    // Constructor
    public SimpleTodoList() {
        head = null;
    }

    // Add task at the end
    public void addTask(String task) {
        TaskNode newNode = new TaskNode(task);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Added: " + task);
    }

    // Display all tasks
    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks in your list!");
            return;
        }
        System.out.println("\n=== Your To-Do List ===");
        TaskNode current = head;
        int position = 1;
        while (current != null) {
            System.out.println(position + ". " + current.task);
            current = current.next;
            position++;
        }
        System.out.println("========================");
    }

    // Remove task by position
    public void removeTask(int position) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (position == 1) {
            String removed = head.task;
            head = head.next;
            System.out.println("Removed: " + removed);
            return;
        }
        TaskNode current = head;
        for (int i = 1; i < position - 1 && current.next != null; i++) {
            current = current.next;
        }
        if (current.next != null) {
            String removed = current.next.task;
            current.next = current.next.next;
            System.out.println("Removed: " + removed);
        } else {
            System.out.println("Invalid task number!");
        }
    }

    // Count total tasks
    public int countTasks() {
        int count = 0;
        TaskNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Search for a task
    public void searchTask(String keyword) {
        System.out.println("\nSearching for: " + keyword);
        TaskNode current = head;
        int position = 1;
        boolean found = false;
        while (current != null) {
            if (current.task.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("Found at position " + position + ": " + current.task);
                found = true;
            }
            current = current.next;
            position++;
        }
        if (!found) {
            System.out.println("No tasks found with: " + keyword);
        }
    }

    // Main method with menu loop directly here
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleTodoList todoList = new SimpleTodoList();

        System.out.println("Welcome to Simple To-Do List!");
        System.out.println("Using Java Linked List");

        int choice;
        do {
            // Menu
            System.out.println("\n=== To-Do List Menu ===");
            System.out.println("1. Add Task");
            System.out.println("2. Display Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Search Task");
            System.out.println("5. Count Tasks");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String task = scanner.nextLine();
                    todoList.addTask(task);
                    break;

                case 2:
                    todoList.displayTasks();
                    break;

                case 3:
                    todoList.displayTasks();
                    if (todoList.head != null) {
                        System.out.print("Enter task number to remove: ");
                        int position = scanner.nextInt();
                        todoList.removeTask(position);
                    }
                    break;

                case 4:
                    System.out.print("Enter search keyword: ");
                    String keyword = scanner.nextLine();
                    todoList.searchTask(keyword);
                    break;

                case 5:
                    System.out.println("Total tasks: " + todoList.countTasks());
                    break;

                case 0:
                    System.out.println("Thank you for using To-Do List!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}