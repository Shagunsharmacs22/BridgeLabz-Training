package ScenarioBased;
import java.util.Scanner;
public class SandeepFitnessChallengeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] pushUps = new int[7];
        for (int i = 0; i < pushUps.length; i++) {
            System.out.println("Enter push-ups for day " + (i + 1) + " (0 if rest day):");
            pushUps[i] = sc.nextInt();
        }
        int totalPushUps = 0;
        int activeDays = 0;
        for (int cnt: pushUps) {
            if (cnt == 0) {
                continue; 
            }
            totalPushUps += cnt;
            activeDays++;
        }
        double averagePushUps = activeDays > 0 ? (double) totalPushUps / activeDays : 0;
        System.out.println("Total push-ups in the week: " + totalPushUps);
        System.out.println("Average push-ups on active days: " + averagePushUps);

    }
}
