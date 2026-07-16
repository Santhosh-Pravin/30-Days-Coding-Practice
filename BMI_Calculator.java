import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();
        double[][] personData = new double[numberOfPersons][3];
        String[] weightStatus = new String[numberOfPersons];
        for (int i = 0; i < numberOfPersons; i++) {
            double weight, height, bmi;
            do {
                System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
                weight = scanner.nextDouble();
                if (weight <= 0) {
                    System.out.println("Please enter a positive value for weight.");
                }
            } while (weight <= 0);
            do {
                System.out.print("Enter height (m) for person " + (i + 1) + ": ");
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("Please enter a positive value for height.");
                }
            } while (height <= 0);
            bmi = weight / (height * height);
            personData[i][0] = height;
            personData[i][1] = weight;
            personData[i][2] = bmi;
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }
        System.out.println("\nPerson Data:");
        System.out.println("Person | Height (m) | Weight (kg) | BMI    | Status");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%6d | %11.2f | %12.2f | %.2f | %s%n", i + 1, personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
        scanner.close();
    }
}
public class LaluTATE{
	public static void main(String[],args){
		Scanner input = new Scanner(System.in);
		