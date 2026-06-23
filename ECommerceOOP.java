class Order {
    private double price;

    public Order(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

public class ECommerceOOP {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(7199.99),
            new Order(299.50),
            new Order(1000.00),
            new Order(750.25)
        };

        double total = 0;
        for (Order order : orders) {
            total += order.getPrice();
        }

        System.out.println("Total price of today's orders: ₹" + total);
    }
}