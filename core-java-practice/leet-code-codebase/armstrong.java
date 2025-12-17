package assignment1;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(armstrongNumber(num));

    }
    public  static String armstrongNumber(int n){
        // code here
        String shags1="Yes";
        String shags2="No";
        int sum=0;
        int temp=n;
        while(n!=0){
            int r=n%10;
            sum+=Math.pow(r,3);
            n=n/10;
        }
        if(sum==temp){
            return shags1;
        }
        else {
            return shags2;
        }
    }
}
