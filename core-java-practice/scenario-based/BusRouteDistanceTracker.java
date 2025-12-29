package ScenarioBased;
import java.util.Scanner;
public class BusRouteDistanceTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalDistance = 0;
        while (true) {
            System.out.println("Enter distance to next stop (in km):");
            int distance = sc.nextInt();
            totalDistance += distance;
            System.out.println("Total distance traveled: " + totalDistance + " km");
            System.out.println("Do you want to get off at this stop? (yes/no):");
            String response = sc.next();
            if (response.equalsIgnoreCase("yes")) {
                System.out.println("You have chosen to get off. Total distance traveled: " + totalDistance + " km");
                break;
            }
        }

    }
}
