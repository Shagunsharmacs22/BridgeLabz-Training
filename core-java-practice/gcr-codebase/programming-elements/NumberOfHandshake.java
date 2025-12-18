package level1;
import java.util.Scanner;

public class NumberOfHandshake {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int num = sc.nextInt();
           int handshakes = (num * (num - 1)) / 2;
            System.out.println("The maximum number of handshakes among " + num + " students is " + handshakes);

    }
}
