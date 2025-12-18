package level1;

public class DiiscountedAmountAndPrice {
    public static void main(String[] args) {
        double fee= 125000;
        double disPercent = 10;
        double disAmount = (disPercent / 100) * fee;
      double  discountedPrice = fee- disAmount;
        System.out.println("Discount Amount: " + disAmount);
        System.out.println("Discounted Price: " + discountedPrice);
    }
}
