package ScenarioBased;
import java.util.Scanner;
public class MetroSmartCardFareDeduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = sc.nextDouble();
        while (true) {
            System.out.print("Enter travel distance in km (or -1 to exit): ");
            int distance = sc.nextInt();
            if (distance == -1) {
                System.out.println("Exiting the metro system.");
                break;
            }
            double fare = (distance <= 5) ? 10.0 : (distance <= 15) ? 20.0 : 30.0;
            if (balance >= fare) {
                balance -= fare;
                System.out.println("Fare of ₹" + fare + " deducted. Remaining balance: ₹" + balance);
            } else {
                System.out.println("Insufficient balance for this trip. Current balance: ₹" + balance);
                break;
            }
        }
    }
}
