package Day_3.OOPs.Abstraction;

public class Main {
    public static void main(String[] args) {
        // Abstraction
        Son son = new Son("Arun", 21);
        son.career("Developer");
        son.partner("Lucky Girl", 21);
        Daughter daughter = new Daughter("Gauri Khan", 53);
        daughter.career("Designer");
        daughter.partner("SRK", 58);

        Parent test = new Parent("DQ", 40, "male") {
            @Override
            void career(String career) {
                System.out.println("Test career " + career);
            }

            @Override
            void partner(String name, int age) {
                System.out.println("Inside test My Partner is " + name + "she is " + age);
            }
        };

        test.career("Actor");
        test.partner("Amal Sufiya", 35);

    }
}
