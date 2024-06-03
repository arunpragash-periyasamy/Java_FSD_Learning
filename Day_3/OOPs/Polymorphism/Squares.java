package Day_3.OOPs.Polymorphism;

public class Squares extends Shapes {
    
    @Override // Method Over riding (Run time poly Morphism) achieved by dynamic method dispatch
    void area() {
        System.out.println("I am Area in Squares");
    }
}
