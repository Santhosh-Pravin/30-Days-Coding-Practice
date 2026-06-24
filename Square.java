import java.util.Scanner;

class Square {
    public static void main(String args[]) {
        double side;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter side length: ");
        side = input.nextDouble();

        double perimeter = 4 * side;

        System.out.println("The length of the side is " + side + " and its perimeter is " + perimeter);

        input.close();
    }
}
