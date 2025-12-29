package ScenarioBased;
import java.util.Scanner;
public class MovieTicketBookingApp {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to the Movie Ticket Booking App!");
            System.out.println("Enter movie type (1. Action, 2. Comedy, 3. Drama) or 0 to exit:");
            int movieType = sc.nextInt();
            if (movieType == 0) {
                System.out.println("Thank you for using the Movie Ticket Booking App!");
                break;
            }
            System.out.println("Enter seat type (1. Gold, 2. Silver):");
            int seatType = sc.nextInt();
            System.out.println("Do you want snacks? (yes/no):");
            String snacks = sc.next();

            double ticketPrice = 0;
            switch (movieType) {
                case 1: // Action
                    ticketPrice += 200;
                    break;
                case 2: // Comedy
                    ticketPrice += 208;
                    break;
                case 3: // Drama
                    ticketPrice += 306;
                    break;
                default:
                    System.out.println("Invalid movie type selected.");
                    continue;
            }

            if (seatType == 1) { // Gold
                ticketPrice += 235;
            } else if (seatType == 2) { // Silver
                ticketPrice +=232;
            } else {
                System.out.println("Invalid seat type selected.");
                continue;
            }

            if (snacks.equalsIgnoreCase("yes")) {
                ticketPrice += 43;
            }

            System.out.println("Your total ticket price is: Rs." + ticketPrice);
            System.out.println("Booking completed! Enjoy your movie!\n");
        }
    }
}
