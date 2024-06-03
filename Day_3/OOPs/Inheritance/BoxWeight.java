package Day_3.OOPs.Inheritance;

public class BoxWeight extends Box{
    double weight;

    BoxWeight() {
        weight = 0.0;
    }
    
    BoxWeight(double length, double breadth, double height, double weight) {
        super(length, breadth, height);
        this.weight = weight;
    }
    
    double volume() {
        return length * breadth * height;
    }
    double weight() {
        return weight;
    }
}
