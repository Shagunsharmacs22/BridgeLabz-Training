package string;
import java.util.Scanner;
public class LengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputStr = sc.nextLine();
        int lengthUsingCharAt = getStringLength(inputStr);
        int lengthUsingBuiltIn = inputStr.length();
        System.out.println("Length using charAt(): " + lengthUsingCharAt);
        System.out.println("Length using built-in length() method: " + lengthUsingBuiltIn);
    }
    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        return count;
    }

}
