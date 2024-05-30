package Day_3.OOPs.Student;


public class Main {
    public static void main(String[] args) {
        Student Arun = new Student();
        Student Senthil = new Student(40, "Senthil Raja", 90.00f);
        Student ArunRef = new Student(Arun);

        // Different ways to access the properties and methods.
        System.out.println("rollNumber : " + Arun.rollNo + ", Name : " + Arun.name + ", Marks : " + Arun.marks);
        System.out.println(Senthil.display());
        System.out.println(ArunRef);
    }
}
