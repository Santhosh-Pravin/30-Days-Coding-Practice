import java.util.Scanner;

public class SumNaturalNumbers {
    public static int sumRecursive(int n) {
        if (n == 1) return 1;
        return n + sumRecursive(n - 1);
    }
    
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }
    
    public static void main(String[] args) {
        // Use try-with-resources to automatically close the scanner
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a natural number: ");
            int n = scanner.nextInt();
            
            if (n <= 0) {
                System.out.println("Please enter a natural number (greater than 0)");
                return;
            }
            
            int sumRec = sumRecursive(n);
            int sumForm = sumFormula(n);
            
            System.out.println("Sum using recursion: " + sumRec);
            System.out.println("Sum using formula: " + sumForm);
            System.out.println("Both results match: " + (sumRec == sumForm));
        }
    }
}
