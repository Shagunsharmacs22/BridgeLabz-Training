package ScenarioBased;
import java.util.*;
public class LineComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Line Comparison Computation Program");
        System.out.println("Enter x1:");
        int x1 = sc.nextInt();
        System.out.println("Enter y1:");
        int y1 = sc.nextInt();
        System.out.println("Enter x2:");
        int x2 = sc.nextInt();
        System.out.println("Enter y2:");
        int y2 = sc.nextInt();
        System.out.println("Enter x3:");
        int x3 = sc.nextInt();
        System.out.println("Enter y3:");
        int y3 = sc.nextInt();
        System.out.println("Enter x4:");
        int x4 = sc.nextInt();
        System.out.println("Enter y4:");
        int y4 = sc.nextInt();
        double length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double length2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
        System.out.println("Length of Line 1: " + length1);
        System.out.println("Length of Line 2: " + length2);
        if (length1 == length2) {
            System.out.println("Both lines are equal");
        } else if (length1 > length2) {
            System.out.println("Line 1 is greater than Line 2");
        } else {
            System.out.println("Line 1 is smaller than Line 2");
        }
	}
}
