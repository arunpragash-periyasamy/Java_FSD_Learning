package Day_3.OOPs.Student;


public class Student {
    int rollNo;
    String name;
    float marks;

    Student() {
        rollNo = 07;
        name = "Arunpragash";
        marks = 80.0f;
    }

    Student(int rollNo, String name, float marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    Student(Student anotherStudent) {
        this.rollNo = anotherStudent.rollNo;
        this.name = anotherStudent.name;
        this.marks = anotherStudent.marks;
    }

    String display() {
        return "rollNumber : " + rollNo + ", Name : " + name + ", Marks : " + marks;
    }

    @Override
    public String toString() {
        return "rollNumber : " + rollNo + ", Name : " + name + ", Marks : " + marks;
    }
}
