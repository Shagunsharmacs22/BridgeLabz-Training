package ScenarioBased;
import java.util.Scanner;
public class FestivalLuckyDraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your number (or type 'exit' to quit):");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for participating!");
                break;
            }
            int num;
            try {
                num= Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                continue;
            }
            if (num% 3 == 0 && num% 5 == 0) {
                System.out.println("Congratulations! You win a gift!");
            } else {
                System.out.println("Sorry, better luck next time!");
            }
        }
    }
}
