package assignment1;

import java.util.Scanner;

public class min_jumps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] shags=new int[size];
        for(int i=0;i<size;i++){
            shags[i]=sc.nextInt();
        }
        System.out.println(minJumps(shags, size));
    }
     public static int minJumps(int[] arr, int n) {
        // your code here
        if(n<=1){
            return 0;
        }
        if(arr[0] == 0){
                return -1;
        }
        int maxReach = arr[0];
        int steps = arr[0];
        int jumps = 1;
        for(int i =1;i<n;i++){
            if(i == n-1){
                return jumps;
            }
            
            maxReach = Math.max(maxReach,i+arr[i]);
            steps--;
            if(steps == 0){
                jumps++;
                
                if(i>=maxReach){
                    return -1;
                }
                
                steps = maxReach -i;
            }
            
        }
        return -1;
    }
}
