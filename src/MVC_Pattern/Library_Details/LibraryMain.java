package MVC_Pattern.Library_Details;

public class LibraryMain {
    public static void main(String[] args) {
        // Create Model
        Book model = new Book("Harry Potter", "J.K.Rowling", 1001);

        // Create view
        LibraryView view = new LibraryView();

        // Create controller
        LibraryController controller = new LibraryController(model, view);

        // Display Original details
        System.out.println("Original Book Details:");
        System.out.println("----------------------");

        controller.updateView();
    }
}
