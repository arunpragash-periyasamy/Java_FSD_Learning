package Day_3.OOPs.StaticNonStatic;

public class Main {
    public static void main(String[] args) {
        Human Arun = new Human("Arunpragash", (byte) 21, false);
        Human Kanishkar = new Human("Kanishkar", (byte) 21, true);
        
        // Static variables in classes
        System.out.println(Human.population);
        System.out.println(Arun.population);

        // static method in class
        System.out.println(Human.getPopulation());
        System.out.println(Kanishkar.display());
    }
}
