package Level_3;
import java.util.Scanner;
public class CountNumberDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        while (number != 0) {
            number /= 10; // remove the last digit
            count++;      // count  Increase by 1
        }
        System.out.println("Number of digits: " + count);
    }
}
