import java.util.Scanner;

class ConversionAgain {
    public static void main(String args[]) {
        double fee;
        double discountPercent;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter fee: ");
        fee = input.nextDouble();
        
        System.out.print("Enter discount percent: ");
        discountPercent = input.nextDouble();
        
        double discountAmount = fee * discountPercent / 100;
        double finalAmount = fee - discountAmount;
        
        System.out.println("The discount amount is INR " + discountAmount + " and the final discounted fee is INR " + finalAmount);
        
        input.close(); // Closing scanner to prevent resource leaks
    }
}
