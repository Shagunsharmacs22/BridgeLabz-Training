package RestaurantTableReservationSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RestaurantReservationSystem system = new RestaurantReservationSystem();

        // Add tables
        System.out.print("Enter number of tables: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            system.addTable(i);
        }

        while (true) {
            System.out.println("\n--- Restaurant Reservation Menu ---");
            System.out.println("1. Reserve Table");
            System.out.println("2. Cancel Reservation");
            System.out.println("3. Show Available Tables");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            try {
                switch (choice) {

                    case 1:
                        System.out.print("Enter table number: ");
                        int tableNo = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter time slot: ");
                        String timeSlot = sc.nextLine();

                        system.reserveTable(tableNo, timeSlot);
                        break;

                    case 2:
                        System.out.print("Enter table number: ");
                        int cancelTable = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter time slot: ");
                        String cancelSlot = sc.nextLine();

                        system.cancelReservation(cancelTable, cancelSlot);
                        break;

                    case 3:
                        System.out.print("Enter time slot: ");
                        String slot = sc.nextLine();

                        system.showAvailableTables(slot);
                        break;

                    case 4:
                        System.out.println("Thank you! Exiting...");
                        sc.close();
                        return;

                    default:
                        System.out.println("❌ Invalid choice");
                }
            } catch (TableAlreadyReservedException e) {
                System.out.println("🚫 " + e.getMessage());
            }
        }
    }
}
