package level1;
public class ProfitLoss {
    public static void main(String[] args) {
        double costPrice = 129;
        double sellingPrice =191;
        if (sellingPrice > costPrice) {
            double profit = sellingPrice - costPrice;
            double profitPercent = (profit / costPrice) * 100;
            System.out.println("Profit: " + profit);
            System.out.println("Profit Percentage: " + profitPercent);
        } else if (costPrice > sellingPrice) {
            double loss = costPrice - sellingPrice;
            double lossPercent = (loss / costPrice) * 100;
            System.out.println("Loss: " + loss);
            System.out.println("Loss Percentage: " + lossPercent);
        } else {
            System.out.println("No Profit No Loss");

        }
    }
}
