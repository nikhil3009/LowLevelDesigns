public class Main {
    public static void main(String[] args) {
        ShapeFactory sp = new ShapeFactory();
        Shape shape = sp.getShape("RECTANGLE");
        shape.draw();

    }
}