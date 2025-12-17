import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = sc.nextDouble(); // base
        System.out.print("Enter exponent: ");
        double ex= sc.nextDouble(); // exponent
        double ans = Math.pow(base, ex); // power calculation
        System.out.println(ans);
    }
}
