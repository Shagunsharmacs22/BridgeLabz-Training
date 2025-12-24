package ScenarioBased;
import java.util.Scanner;
public class ElectionBoothManager {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your age (or -1 to exit): ");
            int age = sc.nextInt();
            if (age == -1) {
                System.out.println("Exiting the voting system.");
                break;
            }
            if (age < 18) {
                System.out.println("You are not eligible to vote.");
                continue;
            }
            System.out.print("Enter your vote (1, 2, or 3 for candidates): ");
            int vote = sc.nextInt();
            if (vote >= 1 && vote <= 3) {
                System.out.println("Thank you for voting for candidate " + vote + "!");
            } else {
                System.out.println("Invalid vote. Please enter 1, 2, or 3.");
            }
        }
    }

}
