import java.util.Scanner;

class TemperatureConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();
        
        double fahrenheitResult = (celsius * 9 / 5) + 32;
        System.out.println(celsius + " Celsius is " + fahrenheitResult + " Fahrenheit.");
        
        input.close(); // Close the scanner to prevent resource leaks
    }
}
