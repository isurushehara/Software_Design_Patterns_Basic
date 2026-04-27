package Abstract_Factory_Method.UIThemes;

// Concrete Product - Light Checkbox
class LightCheckbox implements Checkbox {
    public void paint() {
        System.out.println("Rendering Light Theme Checkbox");
    }
}
