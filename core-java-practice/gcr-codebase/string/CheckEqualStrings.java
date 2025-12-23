package string;
import java.util.*;
public class CheckEqualStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.next();
        System.out.print("Enter second string: ");
        String str2 = sc.next();
        boolean areEqualUsingCharAt = check(str1, str2);
        boolean areEqualUsingEquals = str1.equals(str2);
        System.out.println("Are the strings equal using charAt()? " + areEqualUsingCharAt);
        System.out.println("Are the strings equal using equals()? " + areEqualUsingEquals);

        if (areEqualUsingCharAt == areEqualUsingEquals) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("The methods give different results.");
        }
    }
    public static boolean check(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;

	}

}
