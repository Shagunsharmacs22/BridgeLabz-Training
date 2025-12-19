package Level_2;

public class EvenOdd {
    public static void main(String[] args) {
        int number = 20;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is an Even number");
            } else {
                System.out.println(i + " is an Odd number");
            }
        }
    }
}
