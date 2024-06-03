package Day_3.OOPs.Inheritance;

public class BoxColor extends Box {
    String color;

    BoxColor() {
        color = "green";
    }
    
    BoxColor(double length, double breadth, double height, String color) {
        super(length, breadth, height);
        this.color = color;
    }
}
