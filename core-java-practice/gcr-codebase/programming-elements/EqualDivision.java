package level1;

public class EqualDivision {
    public static void main(String[] args) {
        int totalpen = 14;
        int numberOfPeople = 3;
        int amountPerPerson = totalpen / numberOfPeople;
        System.out.println("Each person gets: " + amountPerPerson);
        int remainingPens = totalpen % numberOfPeople;
        System.out.println("Remaining pens: " + remainingPens);
    }
}
