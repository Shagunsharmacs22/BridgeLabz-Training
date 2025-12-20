package Level_3;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        // Using  if-else statements
        if (year >= 1582) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println( "Leap Year.");
                    } else {
                        System.out.println(" not a Leap Year.");
                    }
                } else {
                    System.out.println(" Leap Year.");
                }
            } else {
                System.out.println(" not a Leap Year.");
            }
        } else {
            System.out.println("Please enter a year greater than or equal to 1582.");
        }
    }
}
