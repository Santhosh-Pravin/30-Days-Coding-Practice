class FeeUni {
    public static void main(String args[]) {
        double fee = 125000;
        double discountPercent = 10;
        double discountAmount = fee * (discountPercent / 100);
        double finalAmount = fee - discountAmount;

        System.out.println("The discount amount is INR " + discountAmount + 
                           " and the final discounted fee is INR " + finalAmount);
    }
}
