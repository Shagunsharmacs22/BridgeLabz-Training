package ScenerioBased;
import java.util.*;
public class TheCoffeeCounterChronicles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gstRate = 0.07;
        while (true){
            System.out.println("Enter coffee type (espresso, latte, cappuccino) or 'exit' to quit:");
            String coffeeType = sc.nextLine().toLowerCase();
            if (coffeeType.equals("exit")) {
                break;
            }
            double price;
            switch (coffeeType) {
                case "espresso":
                    price = 120.0;
                    break;
                case "latte":
                    price = 180.0;
                    break;
                case "cappuccino":
                    price = 160.0;
                    break;
                default:
                    System.out.println("Invalid coffee type");
                    continue;
            }
            System.out.println("Enter quantity:");
            int quantity = sc.nextInt();
            sc.nextLine();
            gstRate = 0.05;
            double totalBill = price * quantity;
            double gstAmount = totalBill * gstRate;
            double finalAmount = totalBill + gstAmount;
            System.out.printf("Total Bill: Rs.%.2f\n", totalBill);
            System.out.printf("GST (5%%): Rs.%.2f\n", gstAmount);
            System.out.printf("Final Amount: Rs.%.2f\n", finalAmount);
        }
    }
}
