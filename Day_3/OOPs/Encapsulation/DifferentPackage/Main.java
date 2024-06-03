package Day_3.OOPs.Encapsulation.DifferentPackage;

import Day_3.OOPs.Encapsulation.SamePackage.ParentClass;

public class Main {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.testProtected();
        subClass.testPublic();
        ParentClass parent = new ParentClass();
        // parent.protectedMethod(); // Here we cannot access the protectMethod
        // because it specified the protected access modifier

        parent.publicMethod();
    }
}
