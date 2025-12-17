import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double r = sc.nextDouble();  //radius
        double area = Math.PI * r * r;
        System.out.println("Area of the circle with radius " + r + " is: " + area);
        
    }
}
