import java.util.Scanner;

class Divisibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        if (num % 5 == 0) { // Divisibility by 5
            System.out.println("Is the number " + num + " divisible by 5? Yes");
        } else {
            System.out.println("Is the number " + num + " divisible by 5? No");
        }
        
        input.close();
    }
}
