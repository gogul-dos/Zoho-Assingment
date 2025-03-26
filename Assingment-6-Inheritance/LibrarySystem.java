import java.util.ArrayList;
import java.util.List;

class LibraryManagementSystem {
    String userType;
    String username;
    String password;
    boolean isLoggedIn = false;
    boolean isRegistered = false;

    public LibraryManagementSystem(String username, String userType, String password) {
        this.username = username;
        this.userType = userType;
        this.password = password;
    }

    void login() {
        this.isLoggedIn = true;
    }

    void register() {
        this.isRegistered = true;
    }

    void logout() {
        this.isLoggedIn = false;
    }
}

class User extends LibraryManagementSystem {
    String name;
    String id;
    Account account;

    public User(String username, String name, String id, String password) {
        super(username, "user", password);
        this.name = name;
        this.id = id;
        this.account = new Account();
    }

    public boolean verify() {
        return this.isLoggedIn;
    }

    public void checkAccount() {
        System.out.println("Account Details:");
        account.displayAccountInfo();
    }

    public String getBookInfo(Book book) {
        return book.toString();
    }
}

class Librarian extends LibraryManagementSystem {
    String id;

    Librarian(String username, String id, String password) {
        super(username, "librarian", password);
        this.id = id;
    }

    public boolean verifyLibrarian() {
        return this.isLoggedIn && this.isRegistered;
    }

    public String searchBook(String searchString, LibraryDatabase database) {
        return database.search(searchString);
    }
}

class Book {
    String title;
    String author;
    String ISBN;
    String publication;

    public Book(String title, String author, String ISBN, String publication) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publication = publication;
    }

    public String showDueDate() {
        return "Due date: 10 days from issue.";
    }

    public String reservationStatus() {
        return "Available";
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Publication: " + publication;
    }
}


class Account {
    int noBorrowedBooks;
    int noReservedBooks;
    int noReturnedBooks;
    int noLostBooks;
    double fineAmount;

    public Account() {
        this.noBorrowedBooks = 0;
        this.noReservedBooks = 0;
        this.noReturnedBooks = 0;
        this.noLostBooks = 0;
        this.fineAmount = 0.0;
    }

    public double calculateFine() {
        return fineAmount;
    }

    public void displayAccountInfo() {
        System.out.println("Borrowed Books: " + noBorrowedBooks);
        System.out.println("Reserved Books: " + noReservedBooks);
        System.out.println("Returned Books: " + noReturnedBooks);
        System.out.println("Lost Books: " + noLostBooks);
        System.out.println("Fine Amount: " + fineAmount);
    }
}


class LibraryDatabase {
    List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void deleteBook(Book book) {
        books.remove(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public String search(String searchString) {
        for (Book book : books) {
            if (book.title.contains(searchString) || book.author.contains(searchString)) {
                return book.toString();
            }
        }
        return "Book not found.";
    }
}


class Staff extends User {
    String dept;

    public Staff(String username, String name, String id, String password, String dept) {
        super(username, name, id, password);
        this.dept = dept;
    }
}

class Student extends User {
    String studentClass;

    public Student(String username, String name, String id, String password, String studentClass) {
        super(username, name, id, password);
        this.studentClass = studentClass;
    }
}


public class LibrarySystem {
    public static void main(String[] args) {
        LibraryDatabase database = new LibraryDatabase();
        Book book1 = new Book("Java Programming", "James Gosling", "123456", "Sun Publications");
        Book book2 = new Book("Python Basics", "Guido van Rossum", "789101", "Python Org");
        database.addBook(book1);
        database.addBook(book2);

        User user = new User("johnDoe", "John Doe", "U001", "password123");
        Librarian librarian = new Librarian("librarian01", "L001", "libpass");

        user.login();
        System.out.println("User Logged In: " + user.verify());
        System.out.println("Book Info: " + user.getBookInfo(book1));

        System.out.println("Librarian Searching for 'Java'");
        System.out.println("Result: " + librarian.searchBook("Java", database));
    }
}
