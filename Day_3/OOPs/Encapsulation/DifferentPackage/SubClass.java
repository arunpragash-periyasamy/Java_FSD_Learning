package Day_3.OOPs.Encapsulation.DifferentPackage;

import Day_3.OOPs.Encapsulation.SamePackage.ParentClass;

public class SubClass extends ParentClass{
    
    // We cannot access getName and setName here because it has no access modifier specified
    // so it will be access only inside the same package.

    void testProtected() {
        super.protectedMethod();
    }

    void testPublic() {
        super.publicMethod();
        
    }
}
