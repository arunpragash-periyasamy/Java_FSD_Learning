package Day_3.OOPs.Polymorphism;

public class Shapes {
    void area() {
        System.out.println("I am area in Shapes");
    }

    // Method Overloading (Compile Time Polymorphism)
    void area(double length, double breadth) {
        System.out.println("Area " + (length*breadth));
    }
}
