import java.util.Scanner;

class MultiplesOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("Multiples of " + number + " below 100:");

        for (int i = number; i < 100; i += number) {
            System.out.println(i);
        }

        input.close();
    }
}
