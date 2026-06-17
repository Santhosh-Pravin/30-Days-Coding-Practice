class ProfitAndLoss {
    public static void main(String args[]) {
        System.out.println("Profit and Loss Calculation");

        double costPrice = 129;
        double sellingPrice = 191;
        
        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;
        
        System.out.println("The Cost Price is INR " + costPrice + 
                           " and the Selling Price is INR " + sellingPrice);
        System.out.println("The profit is INR " + profit + 
                           " and the Profit Percentage is " + profitPercentage + "%");
    }
}
