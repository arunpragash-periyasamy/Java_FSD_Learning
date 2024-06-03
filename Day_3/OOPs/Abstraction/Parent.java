package Day_3.OOPs.Abstraction;

abstract public class Parent {
    // if one or more than one method is abstract then class also abstract
    String name;
    int age;
    String gender;

    Parent(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    abstract void career(String career);

    abstract void partner(String name, int age);
}
