package level2;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int num1=scanner.nextInt();
         int num2=scanner.nextInt();
         int q=num1/num2;
        int r=num1%num2;
        System.out.println("The Quotient is "+q+" and Reminder is "+r+" of two number "+num1+" and "+num2);
    }
}
