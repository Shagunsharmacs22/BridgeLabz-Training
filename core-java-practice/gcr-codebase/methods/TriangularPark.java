package methods;
import java.util.Scanner;
public class TriangularPark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1 of the triangular park (in meters): ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side 2 of the triangular park (in meters): ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side 3 of the triangular park (in meters): ");
        double side3 = sc.nextDouble();
        double perimeter = calculatePerimeter(side1, side2, side3);
        double totalDistance = 5000.0; // 5 km in meters
        int rounds = (int) Math.ceil(totalDistance / perimeter);
        System.out.println("To complete a 5 km run, the athlete must complete " + rounds + " rounds in the triangular park.");
    }
    public static double calculatePerimeter(double a, double b, double c) {
        return a + b + c;
    }
}
