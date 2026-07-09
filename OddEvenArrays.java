import java.util.Scanner;

class OddEvenArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int number = input.nextInt();

        if (number < 1) {
            System.out.println("Error: Enter a natural number greater than 0.");
            input.close();
            return;
        }

        int oddSize = (number + 1) / 2;
        int evenSize = number / 2;
        int[] oddNumbers = new int[oddSize];
        int[] evenNumbers = new int[evenSize];
        int oddIndex = 0, evenIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            } else {
                oddNumbers[oddIndex++] = i;
            }
        }

        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        System.out.println();

        System.out.print("Even Numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        System.out.println();
        input.close();
    }
}
