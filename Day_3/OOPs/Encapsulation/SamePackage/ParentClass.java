package Day_3.OOPs.Encapsulation.SamePackage;

public class ParentClass {
    private String name; // this name will be access only this class. 

    // withoud access specifier will access inside the same package only
    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    
    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    public void publicMethod() {
        System.out.println("Public Method");
    }

}
