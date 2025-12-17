import java.util.Scanner;
public class perimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        double l = sc.nextDouble(); // length of rectangle
        System.out.print("Enter width of rectangle: ");
        double w= sc.nextDouble(); // width of rectangle
        double perimeter = 2 * (l + w); // perimeter formula
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
