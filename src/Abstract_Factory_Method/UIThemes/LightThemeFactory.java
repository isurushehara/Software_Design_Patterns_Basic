package Abstract_Factory_Method.UIThemes;

// Concrete Factory - Light Theme
class LightThemeFactory implements GUIFactory {
    public Button createButton() {
        return new LightButton();
    }
    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }
}
