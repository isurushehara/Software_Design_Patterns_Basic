package MVC_Pattern.Library_Details;

public class LibraryController {
    private Book model;
    private LibraryView view;

    public LibraryController(Book model, LibraryView view) {
        this.model = model;
        this.view = view;
    }

    // Update View
    public void updateView() {
        view.displayBookDetails(model.getTitle(), model.getAuthor(), model.getBookId());
    }

    // Update Model Date
    public void setBookTitle(String title) {
        model.setTitle(title);
    }
    public void setBookAuthor(String author) {
        model.setAuthor(author);
    }
}
