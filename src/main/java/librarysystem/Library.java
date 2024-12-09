package librarysystem;

import exception.BookNotFound;

import java.util.HashSet;
import java.util.Set;

public class Library {
    private Set<Book> books = new HashSet<>();

    public void addBook(Book book) {
        books.add(book);
        ++book.id;
    }

    public void deleteBook(Book book) throws BookNotFound {
        if (!this.books.contains(book)) {
            throw new BookNotFound("Book not found");
        }
        this.books.remove(book);
        System.out.println("Removed sucessfully");
    }

    public Book findBook(String title) throws BookNotFound {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        throw new BookNotFound("Kitab tapılmadı: " + title);
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("Kitabxanada heç bir kitab yoxdur.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }

    }
}