package OOPs;

public class Constructor {
    public static void main(String[] args) {
        // Using default constructor
        Student s1 = new Student();
        s1.name = "Raman";
        s1.rollno = 69;
        s1.password = "raman.07z";

        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 100;

        // Using copy constructor
        Student s4 = new Student(s1);
        s4.password = "raman";
        s4.marks[1] = 70;
        for (int i=0; i<3; i++){
            System.out.println(s4.marks[i]);
        }

        System.out.println("s1 -> " + s1.name + " " + s1.rollno + " " + s1.password);
        System.out.println("s4 -> " + s4.name + " " + s4.rollno + " " + s4.password);
    }
}

class Student {
    String name;
    int rollno;
    String password;
    int marks[];

    // Default (non-parameterized) constructor
    Student() {
        System.out.println("Default constructor called");
        marks = new int[3];
    }

    // Parameterized constructor
    Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
        marks = new int[3];

    }

    // Copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.rollno = s1.rollno;
        this.marks = s1.marks;

        // password is not copied intentionally (you can copy if you want)
    }
}
