import java.util.Scanner;

class Distance {
    public static void main(String args[]) {
        double feet;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        feet = input.nextDouble();

        double yards = feet / 3;
        double miles = yards / 1760;

        System.out.println("Distance in feet: " + feet);
        System.out.println("Distance in yards: " + yards);
        System.out.println("Distance in miles: " + miles);

        input.close();
    }
}
