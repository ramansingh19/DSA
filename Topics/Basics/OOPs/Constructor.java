package OOPs;

public class Constructor {

    public static void main(String[] args) {

        Student st = new Student("Raman");
        Student s2 = new Student();
        Student s3 = new Student(69);
//        System.out.println(st.name);
    }
}



class Student {
    String name ;
    int rollno ;

    //constructor , if you not intialize this here then construcor defalut
    //it is also parameterized constructor
    Student(String name){
        this.name = name;
    }

//    Non-parameterized constructor
    Student(){
        System.out.println("Aman");
    }

    //
    Student(int rollno){
        this.rollno = rollno;
    }

}
