package Level_1;
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double number;
        do {
            number = sc.nextDouble();
            total += number;
        } while (number != 0);
        System.out.println("The sum of the numbers is: " + total);
    }
}
