package Day_3.OOPs.Abstraction;

public class Daughter extends Parent {
    Daughter(String name, int age) {
        super(name, age, "female");
    }

        void career(String career) {
            System.out.println("I am a " + career);
        }

        void partner(String name, int age){
            System.out.println("My partner name is " + name + " and age is " + age);
        }
}
