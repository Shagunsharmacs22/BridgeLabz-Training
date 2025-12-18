package level1;
import java.util.*;

public class UniversityDiscount {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         double fee = sc.nextDouble();  
            double disPercent = sc.nextDouble();
            double disAmount = (disPercent / 100) * fee;
            double discountedPrice = fee - disAmount;
            System.out.println("The discount amount is INR " + disAmount + " and final discounted fee is INR " + discountedPrice);
    }
}
