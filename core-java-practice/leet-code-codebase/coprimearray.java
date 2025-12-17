package assignment1;

import java.util.Scanner;

public class coprimearray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] shags=new int[size];
        for(int i=0;i<size;i++){
            shags[i]=sc.nextInt();
        }
        System.out.println(countCoPrime(shags, size));

    }
    public static  int countCoPrime(int a[], int n)
    {
        // Complete the function
        int c=0;
        for(int i=0;i<n-1;i++){
            if(gcd(a[i],a[i+1])!=1){
                c++;
            }
        }
        return c;
        
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
