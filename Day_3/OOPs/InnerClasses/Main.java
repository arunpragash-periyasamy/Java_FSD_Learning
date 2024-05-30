package Day_3.OOPs.InnerClasses;

import Day_3.OOPs.InnerClasses.OuterClass.InnerClassTwo;

public class Main {
    public static void main(String[] args) {

        // Outer class
        OuterClass Outer = new OuterClass();
        
        // non static inner class
        OuterClass.InnerClass Inner = Outer.new InnerClass();
        Inner.display();
        Outer.display();

        // static inner class
        InnerClassTwo InnerTwo = new InnerClassTwo();
        InnerTwo.display();
    }
}
