import java.util.Scanner;
public class volumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r= sc.nextDouble(); // radius
        double h= sc.nextDouble(); // height
        double v = Math.PI * Math.pow(r, 2) * h;
        System.out.println("Volume of the cylinder: " + v);
    }
}
