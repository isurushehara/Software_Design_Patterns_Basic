package Abstract_Factory_Method.UIThemes;

// Concrete Product - Light Button
class LightButton implements Button {
    public void paint() {
        System.out.println("Rendering Light Theme Button");
    }
}
