package assignment1;

import java.util.Scanner;

public class gamewithInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int testc=sc.nextInt();
     	while(testc-->0){
		       int shags=sc.nextInt();
		           if(shags%3==0 ){
		               System.out.println("Second");
		           }
		           else {
		               System.out.println("First");
		           }
		       }
    }
}
