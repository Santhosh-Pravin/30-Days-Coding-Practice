public class ECommerceProcedural {
    public static void main(String[] args) {
        double[] orderPrices = {499.99, 299.50, 1000.00, 750.25};
        double total = 0;

        for (int i = 0; i < orderPrices.length; i++) {
            total += orderPrices[i];
        }

        System.out.println("Total price of today's orders: ₹" + total);
    }
}