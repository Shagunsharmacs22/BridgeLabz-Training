import java.util.Scanner;
public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double p = sc.nextDouble(); // principal
        System.out.print("Enter rate of interest: ");
        double r = sc.nextDouble(); // rate of interest
        System.out.print("Enter time in years: ");
        double t = sc.nextDouble(); // time in years
        double si = (p * r * t) / 100; // simple interest formula
        System.out.println("Simple Interest: " + si);
    }
}
