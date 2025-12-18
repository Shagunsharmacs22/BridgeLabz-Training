package level2;
import java.util.*;

public class IntOperation {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int c=scanner.nextInt();
            int op1=a + b * c;
            int op2=a * b + c;
            int op3=c + a / b;
            int op4=a % b + c;
            System.out.println("The results of Int Operations are "+op1+", "+op2+", "+op3+" and "+op4);

    }
}
