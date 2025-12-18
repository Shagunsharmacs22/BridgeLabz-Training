package level1;
import java.util.*;

public class AreaOfTrainagle {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 6.4516;
        System.out.println("The area of the triangle is " + areaInInches + "square inches and " + areaInCm + " square centimeters.");

    }
}
