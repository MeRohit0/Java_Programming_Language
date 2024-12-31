package Practice_Question.codechief;

import java.util.*;

class Book {
    int bookId;
    String title;
    String author;
    boolean isAvailable;

    // Constructor for the Book class
    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true; // Initially, the book is available
    }

    @Override
    public String toString() {
        return bookId + ". " + title + " by " + author + " - " + (isAvailable ? "Available" : "Unavailable");
    }
}

class Library {
    private Map<Integer, Book> books; // Book ID -> Book object
    private Map<Integer, Queue<String>> waitingList; // Book ID -> Queue of users waiting for the book
    private List<String> borrowedBooks; // List to track borrowed books in order of borrowing

    // Constructor for Library class
    public Library() {
        books = new HashMap<>();
        waitingList = new HashMap<>();
        borrowedBooks = new ArrayList<>();
    }

    // Method to add a new book to the library
    public void addBook(int bookId, String title, String author) {
        if (books.containsKey(bookId)) {
            System.out.println("Book with ID " + bookId + " already exists.");
        } else {
            Book newBook = new Book(bookId, title, author);
            books.put(bookId, newBook);
            System.out.println("Book '" + title + "' by " + author + " added to the library.");
        }
    }

    // Method to search for a book by title or author
    public void searchBook(String title, String author) {
        List<Book> foundBooks = new ArrayList<>();

        for (Book book : books.values()) {
            if ((title != null && book.title.toLowerCase().contains(title.toLowerCase())) ||
                (author != null && book.author.toLowerCase().contains(author.toLowerCase()))) {
                foundBooks.add(book);
            }
        }

        if (foundBooks.isEmpty()) {
            System.out.println("No books found matching your criteria.");
        } else {
            System.out.println("Found Books:");
            for (Book book : foundBooks) {
                System.out.println(book);
            }
        }
    }

    // Method to borrow a book
    public void borrowBook(int bookId, String user) {
        if (!books.containsKey(bookId)) {
            System.out.println("Book with ID " + bookId + " not found in the library.");
            return;
        }

        Book book = books.get(bookId);

        if (book.isAvailable) {
            book.isAvailable = false;
            borrowedBooks.add(book.title + " borrowed by " + user);
            System.out.println("User '" + user + "' borrowed '" + book.title + "'.");
        } else {
            System.out.println("Sorry, the book '" + book.title + "' is currently unavailable.");
            waitingList.computeIfAbsent(bookId, k -> new LinkedList<>()).add(user);
            System.out.println("Added '" + user + "' to the waiting list.");
        }
    }

    // Method to return a borrowed book
    public void returnBook(int bookId, String user) {
        if (!books.containsKey(bookId)) {
            System.out.println("Book with ID " + bookId + " not found.");
            return;
        }

        Book book = books.get(bookId);
        boolean found = false;

        for (int i = 0; i < borrowedBooks.size(); i++) {
            String record = borrowedBooks.get(i);
            if (record.contains(book.title) && record.contains(user)) {
                borrowedBooks.remove(i);
                book.isAvailable = true;
                System.out.println("User '" + user + "' returned '" + book.title + "'.");
                found = true;

                // Check if there is anyone waiting for the book
                if (waitingList.containsKey(bookId) && !waitingList.get(bookId).isEmpty()) {
                    String nextUser = waitingList.get(bookId).poll();
                    System.out.println("Notifying user '" + nextUser + "' that '" + book.title + "' is now available.");
                    borrowBook(bookId, nextUser); // Automatically borrow the book for the next user
                }
                break;
            }
        }

        if (!found) {
            System.out.println("No borrowing record found for user '" + user + "' for this book.");
        }
    }

    // Method to view all books in the library
    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Books in the Library:");
            for (Book book : books.values()) {
                System.out.println(book);
            }
        }
    }

    // Method to view all borrowed books
    public void viewBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("No borrowed books.");
        } else {
            System.out.println("Currently Borrowed Books:");
            for (String record : borrowedBooks) {
                System.out.println(record);
            }
        }
    }
}

public class LibraryManagementSystem {

    public static void main(String[] args) {
        Library library = new Library();

        // Add some books to the library
        library.addBook(101, "Harry Potter and the Philosopher's Stone", "J.K. Rowling");
        library.addBook(102, "The Lord of the Rings", "J.R.R. Tolkien");
        library.addBook(103, "The Great Gatsby", "F. Scott Fitzgerald");

        // View all books
        library.viewBooks();

        // Search books by title
        library.searchBook("harry potter", null);
        library.searchBook(null, "J.R.R. Tolkien");

        // Borrow books
        library.borrowBook(101, "Rohit");
        library.borrowBook(102, "Manish");

        // View borrowed books
        library.viewBorrowedBooks();

        // Return a book
        library.returnBook(101, "Rohit");

        // View books again
        library.viewBooks();

        // Try to borrow an unavailable book
        library.borrowBook(101, "Nayon");

        // View borrowed books again
        library.viewBorrowedBooks();

        // Return a book that wasn't borrowed
        library.returnBook(103, "Rohit");
    }
}
