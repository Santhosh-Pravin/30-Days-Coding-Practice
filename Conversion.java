import java.util.Scanner;

class Conversion {
    public static void main(String args[]) {
        double kilometer;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter kilometers: ");
        kilometer = input.nextDouble();
        
        double miles = kilometer / 1.6;
        
        System.out.println("The total miles is " + miles + " miles for the given " + kilometer + " km.");
        
        input.close(); // Closing scanner to prevent resource leaks
    }
}
