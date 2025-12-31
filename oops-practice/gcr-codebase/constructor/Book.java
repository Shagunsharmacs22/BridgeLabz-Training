package constructor;
public class Book {
    public static void main(String[] args) {
        BookItem book1 = new BookItem(); 
        BookItem book2 = new BookItem("1994", "Shagun", 9.99); 
    }
}
class BookItem {
    private String title;
    private String author;
    private double price;
    // Default constructor
    public BookItem() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
        displayBookInfo();
    }
    // Parameterized constructor
    public BookItem(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        displayBookInfo();
    }

    public void displayBookInfo() {
        System.out.printf("Title: %s, Author: %s, Price: $%.2f%n", title, author, price);
    }
}
