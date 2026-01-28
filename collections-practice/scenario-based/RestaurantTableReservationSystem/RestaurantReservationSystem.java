package RestaurantTableReservationSystem;

import java.util.*;

public class RestaurantReservationSystem {

    Map<Integer, Table> tables = new HashMap<>();
    List<Reservation> reservations = new ArrayList<>();

    // add table
    void addTable(int tableNumber) {
        tables.put(tableNumber, new Table(tableNumber));
    }

    // reserve table
    void reserveTable(int tableNumber, String timeSlot)
            throws TableAlreadyReservedException {

        for (Reservation r : reservations) {
            if (r.tableNumber == tableNumber &&
                r.timeSlot.equals(timeSlot)) {

                throw new TableAlreadyReservedException(
                        "Table " + tableNumber + " already reserved for " + timeSlot);
            }
        }

        reservations.add(new Reservation(tableNumber, timeSlot));
        System.out.println("✅ Table " + tableNumber + " reserved");
    }

    // cancel reservation
    void cancelReservation(int tableNumber, String timeSlot) {
        Iterator<Reservation> it = reservations.iterator();

        while (it.hasNext()) {
            Reservation r = it.next();
            if (r.tableNumber == tableNumber &&
                r.timeSlot.equals(timeSlot)) {

                it.remove();
                System.out.println("❌ Reservation cancelled");
                return;
            }
        }
        System.out.println("⚠️ No reservation found");
    }

    // show available tables
    void showAvailableTables(String timeSlot) {
        System.out.println("Available tables for " + timeSlot + ":");

        for (int tableNo : tables.keySet()) {
            boolean booked = false;

            for (Reservation r : reservations) {
                if (r.tableNumber == tableNo &&
                    r.timeSlot.equals(timeSlot)) {
                    booked = true;
                    break;
                }
            }

            if (!booked) {
                System.out.println("Table " + tableNo);
            }
        }
    }
}
