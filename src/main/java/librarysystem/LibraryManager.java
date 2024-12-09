package librarysystem;

import exception.BookNotFound;

import java.util.TooManyListenersException;

public class LibraryManager {
    public static void main(String[] args) throws BookNotFound {
        Library library = new Library();

        Book book1 = new Book("Java Programi", "Riyad Rahimov", 500);
        Book book2 = new Book("Qarli bir gun", "Natiq Ceferov", 300);
        Book book3 = new Book("Tom and Jerry", "Jale Memmedova", 450);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.listBooks();
        library.deleteBook(book2);
        library.listBooks();
        library.findBook("Tom and Jerry");
        library.listBooks();
        library.findBook("Qarli bir gun");

    }
}
