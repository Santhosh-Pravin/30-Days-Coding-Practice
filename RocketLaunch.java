import java.util.Scanner;

class RocketLaunch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the countdown start value: ");
        int counter = input.nextInt();

        // Using a while loop to count down
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // Decrement the counter
        }

        System.out.println("Rocket Launched!");
        input.close();
    }
}
