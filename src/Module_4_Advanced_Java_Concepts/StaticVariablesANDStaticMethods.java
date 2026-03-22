package Module_4_Advanced_Java_Concepts;
class Student {
    static String collegeName = "ABC College";
    String studentName;
    Student(String name) {
        this.studentName = name;
    }
    // Static method
    static void changeCollege(String newCollege) {
        collegeName = newCollege;
    }
    // Instance method
    void display() {
        System.out.println("Name: " + studentName);
        System.out.println("College: " + collegeName);
        System.out.println();
    }
}

public class StaticVariablesANDStaticMethods {
    public static void main(String[] args) {
        Student s1 = new Student("John Doe");
        Student s2 = new Student("Bob Smith");

        s1.display();
        s2.display();
        Student.changeCollege("XYZ University");

        System.out.println("After changing college name:\n");

        s1.display();
        s2.display();
    }
}
