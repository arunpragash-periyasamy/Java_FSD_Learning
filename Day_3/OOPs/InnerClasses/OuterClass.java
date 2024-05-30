package Day_3.OOPs.InnerClasses;

public class OuterClass {
    class InnerClass {
        void display() {
            System.out.println("Inner Class");
        }
    }

    static class InnerClassTwo {
        void display() {
            System.out.println("Inner Class Two");
        }
    }

    void display() {
        System.out.println("Outer Class");
    }
}
