package Day_3.OOPs.Inheritance;

public class Box {
    double length;
    double breadth;
    double height;

    Box() {
        length = 0.0;
        breadth = 0.0;
        height = 0.0;
    }
    Box(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
        height = 0.0;
    }

    Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    
    double volume() {
        return length * breadth * height;
    }
}
