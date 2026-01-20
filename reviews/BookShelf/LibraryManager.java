package BookShelf;

public class LibraryManager {
    public static void main(String[] args) {

        Bookshelf shelf = new Bookshelf();

        Book b1 = new Book("Clean Code", "Robert Martin");
        Book b2 = new Book("Java Basics", "James Gosling");

        shelf.addBook("Programming", b1);
        shelf.addBook("Programming", b2);
        shelf.addBook("Programming", b1); // duplicate

        shelf.printCatalog();

        shelf.borrowBook("Programming", b1);
        shelf.printCatalog();
    }
}

