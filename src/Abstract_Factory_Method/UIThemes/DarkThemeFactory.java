package Abstract_Factory_Method.UIThemes;

// Concrete Factory - Dark Theme
class DarkThemeFactory implements GUIFactory {
    public Button createButton() {
        return new DarkButton();
    }
    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }
}
