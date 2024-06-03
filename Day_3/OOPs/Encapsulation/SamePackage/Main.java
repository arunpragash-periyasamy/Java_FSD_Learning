package Day_3.OOPs.Encapsulation.SamePackage;

public class Main {
    public static void main(String[] args) {
        ParentClass parent = new ParentClass();
        SubClass subClass = new SubClass();
        subClass.setName("Arunpragash");
        System.out.println(subClass.getName());
        parent.protectedMethod();
        parent.publicMethod();
        subClass.protectedMethod();
        subClass.publicMethod();
        
    }
}
