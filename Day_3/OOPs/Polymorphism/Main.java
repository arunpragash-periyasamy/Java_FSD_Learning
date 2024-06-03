package Day_3.OOPs.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Shapes square = new Squares();
        Shapes shapes = new Shapes();
        triangle.area();
        square.area();
        shapes.area();
    }
}
