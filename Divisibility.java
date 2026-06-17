import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any integer: ");
        int num = input.nextInt();
        if (num % 3 == 0) {
            System.out.print("The number is divisible by 3");
        } else {
            System.out.print("The number is not divisible by 3");
        }

    }
}

