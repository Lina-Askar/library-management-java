

package strproject;


import java.util.LinkedList;

public class Book {
    
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public static void displayAvailableBooks(LinkedList<Book> books) {
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Available: Yes");
                System.out.println("--------------------");
            }
        }
    }
}
