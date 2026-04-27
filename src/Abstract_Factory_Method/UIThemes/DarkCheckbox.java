package Abstract_Factory_Method.UIThemes;

// Concrete Product - Dark Checkbox
class DarkCheckbox implements Checkbox {
    public void paint() {
        System.out.println("Rendering Dark Theme Checkbox");
    }
}
