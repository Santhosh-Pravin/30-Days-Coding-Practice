import java.util.Scanner;

class DivisibilityAgain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 3 numbers:"); // Input from user
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        
        if (number1 < number2 && number1 < number3) {
            System.out.println("Is the first number the smallest? Yes");
        } else {
            System.out.println("Is the first number the smallest? No");
        }
        
        input.close();
    }
}
