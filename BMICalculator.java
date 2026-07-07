import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your Weight (in kg): ");
        double weight = input.nextDouble();
        
        System.out.print("Enter your Height (in cm): ");
        double height = input.nextDouble() / 100.0;  // Convert height from cm to meters
        
        double bmi = weight / (height * height);
        
        System.out.printf("Your BMI: %.2f\n", bmi);
        
        if (bmi <= 18.4) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal");
        } else if (bmi >= 25.0 && bmi <= 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
        
        input.close(); // Close the scanner to prevent resource leaks
    }
}
