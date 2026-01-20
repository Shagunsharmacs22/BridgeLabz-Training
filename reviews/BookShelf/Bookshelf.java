package BookShelf;
import  java.util.*;
class Bookshelf {
    HashMap<String, LinkedList<Book>> mp= new HashMap<>();
    void addBook(String genre, Book book) {
        mp.putIfAbsent(genre, new LinkedList<>());
        LinkedList<Book> list = mp.get(genre);
        if (list.contains(book)) {
            System.out.println("Duplicate book not allowed");
            return;
        }
        list.add(book);
        System.out.println("Book added to " + genre);
    }
    void borrowBook(String genre, Book book) {

        if (!mp.containsKey(genre)) {
            System.out.println("Genre not found");
            return;
        }

        LinkedList<Book> list =mp.get(genre);

        if (list.remove(book)) {
            System.out.println("Book borrowed");
        } else {
            System.out.println("Book not available");
        }
    }
    void printCatalog() {
        if (mp.isEmpty()) {
            System.out.println("Library is empty");
            return;
        }
        for (String genre : mp.keySet()) {
            System.out.println("Genre: " + genre);

            for (Book b : mp.get(genre)) {
                System.out.println("  " + b.name + " by " + b.author);
            }
        }
    }
}

