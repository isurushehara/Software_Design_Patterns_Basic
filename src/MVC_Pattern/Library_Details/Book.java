package MVC_Pattern.Library_Details;

public class Book {
    private String title;
    private String author;
    private int bookid;

    public Book(String title, String author, int bookid) {
        this.title = title;
        this.author = author;
        this.bookid = bookid;
    }

    // Getters
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getBookId() {
        return bookid;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
}
