package Day_3.OOPs.Abstraction;

public class Son extends Parent {
    Son(String name, int age ) {
        super(name, age, "male");
    }

    void career(String career) {
        System.out.println("I am a " + career);
    }
    void partner(String name, int age) {
        System.out.println("My partner name is " + name + " and age is " + age);
    }
}
