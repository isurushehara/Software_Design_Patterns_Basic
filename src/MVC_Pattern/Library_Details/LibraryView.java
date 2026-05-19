package MVC_Pattern.Library_Details;

public class LibraryView {
    public void displayBookDetails(String title, String author, int bookid) {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Book ID: " + bookid);
    }
}

