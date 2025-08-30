package OOPs.Problems;

public class Practice_07 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Raman";
        s.marks = 90;
        s.rollno = 69;

        System.out.println(s.name);
        System.out.println(s.marks);
        System.out.println(s.rollno);
    }
}

//Class & Object
class Student{
    String name;
    int rollno;
    int marks;

    void name(String name){
        this.name = name;
    }

    void rollno(int rollno){
        this.rollno = rollno;
    }

    void marks(int marks){
        this.marks = marks;
    }
}
