package Day_3.OOPs.Encapsulation.SamePackage;

public class SubClass extends ParentClass {
 
    void setName(String name) {
        // super.name =name; // we cannot do like this for the private variable
        super.setName(name);
    }

    String getName() {
        return super.getName();
    }
}
