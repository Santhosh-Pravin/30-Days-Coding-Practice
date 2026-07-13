import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        ArrayList<Integer> digits = new ArrayList<>();
        while (number != 0) {
            digits.add(number % 10);
            number /= 10;
        }
        Collections.reverse(digits);
        System.out.print("Reversed number: ");
        for (int digit : digits) {
            System.out.print(digit);
        }
        scanner.close();
    }
}
