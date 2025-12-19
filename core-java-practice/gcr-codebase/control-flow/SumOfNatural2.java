package Level_1;
import java.util.Scanner;

public class SumOfNatural2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number >= 0) {
            int sumFormula = number * (number + 1) / 2;
            int sumLoop = 0;
            for (int i = 1; i <= number; i++) {
                sumLoop += i;
            }
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using loop: " + sumLoop);
            if (sumFormula == sumLoop) {
                System.out.println("Both computations are correct and equal.");
            } else {
                System.out.println("Both computations are not equal");
            }
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}
