package Abstract_Factory_Method.UIThemes;

// Main Class
public class UIThemes {
    public static void main(String[] args) {
        GUIFactory factory;
// Simulating theme selection
        String theme = "dark";
        if (theme.equalsIgnoreCase("dark")) {
            factory = new DarkThemeFactory();
        } else {
            factory = new LightThemeFactory();
        }
// Create UI components using the factory
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();
// Use the components
        button.paint();
        checkbox.paint();
    }
}