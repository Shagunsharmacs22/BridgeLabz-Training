package Level_3;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double first = sc.nextDouble();
        double second = sc.nextDouble();
        String op = sc.next();
        double result;
        switch (op) {
            case "+":
                result = first + second;
                System.out.println(result);
                break;
            case "-":
                result = first - second;
                System.out.println(result);
                break;
            case "*":
                result = first * second;
                System.out.println(result);
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println(result);
                } else {
                    System.out.println("Error");
                }
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }
        
    }
}
