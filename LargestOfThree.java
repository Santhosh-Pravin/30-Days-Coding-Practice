import java.util.Scanner;

class LargestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 3 numbers:");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        
        if (number1 > number2 && number1 > number3) {
            System.out.println("The first number is the largest.");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("The second number is the largest.");
        } else {
            System.out.println("The third number is the largest.");
        }
        
        input.close();
    }
}
