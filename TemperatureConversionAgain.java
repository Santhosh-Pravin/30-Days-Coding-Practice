import java.util.Scanner;

class TemperatureConversionAgain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        
        double celsiusResult = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius.");
        
        input.close(); // Close the scanner to prevent resource leaks
    }
}
