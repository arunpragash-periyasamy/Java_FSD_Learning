package Day_3.OOPs.StaticNonStatic;

public class Human {
    String name;
    byte age;
    boolean married;
    static double population;

    Human(String name, byte age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
        Human.population++; // It is a static variable
    }

    static double getPopulation() {
        return population;
    }

    
    String display() {
        return String.format("Name : %s, Age : %d, Married : %b",this.name, this.age, this.married);
    }

}
