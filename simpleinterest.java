import java.util.Scanner;

public class simpleinterest {

    
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    
    public static int calculateHandshakes(int N) {
        return (N * (N - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the Principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the Rate of Interest: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the Time period in years: ");
        double time = scanner.nextDouble();

        
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal +
                ", Rate of Interest " + rate + ", and Time " + time + " years.");

        
        System.out.print("Enter the number of students: ");
        int N = scanner.nextInt();

        
        int handshakes = calculateHandshakes(N);

        
        System.out.println("The maximum number of handshakes among " + N + " students is " + handshakes + ".");

        
        scanner.close();
    }
}
