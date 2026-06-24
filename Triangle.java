import java.util.Scanner;

class Triangle {
    public static void main(String args[]) {
        double base, height;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base (in cm): ");
        base = input.nextDouble();
        System.out.print("Enter height (in cm): ");
        height = input.nextDouble();

        double areaCm = (base * height) / 2;
        double areaInches = areaCm / 2.54;
        double areaFeet = areaInches / 12;

        System.out.println("Area of the triangle:");
        System.out.println("In cm²: " + areaCm);
        System.out.println("In inches²: " + areaInches);
        System.out.println("In feet²: " + areaFeet);

        input.close();
    }
}
