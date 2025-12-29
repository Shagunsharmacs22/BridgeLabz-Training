package ScenarioBased;
import java.util.Scanner;
 public class EmployeeWageComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 4;
        int totalWage = 0;
        System.out.println("Welcome to Employee Wage Computation Program");
        System.out.print("Enter number of working days: ");
        int days = sc.nextInt();
        for (int i = 1; i <= days; i++) {
            System.out.println("\nDay " + i);
            System.out.println("Enter Employee Type:");
            System.out.println("1 - Full Time");
            System.out.println("2 - Part Time");
            System.out.println("0 - Absent");
            int choice = sc.nextInt();
            int hours = 0;
            if (choice == 1) {
                hours = fullDayHour;
            } else if (choice == 2) {
                hours = partTimeHour;
            } else {
                hours = 0;
            }
            totalWage += hours * wagePerHour;
        }
        System.out.println("\nTotal Employee Wage = " + totalWage);
    }
}
