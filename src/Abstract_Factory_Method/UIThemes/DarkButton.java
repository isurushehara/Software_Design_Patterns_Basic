package Abstract_Factory_Method.UIThemes;

// Concrete Product - Dark Button
class DarkButton implements Button {
    public void paint() {
        System.out.println("Rendering Dark Theme Button");
    }
}
