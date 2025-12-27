package OOPs;

public class Static_Keyword {
    public static void main(String[] args) {

        Students s1 = new Students();
        s1.SchoolName = "Raman";
        System.out.println(s1.SchoolName);

        Students s2 = new Students();
        System.out.println(s2.SchoolName); // Raman

        Students s3 = new Students();
        s3.SchoolName = "Aman";

        System.out.println(s1.SchoolName); // Aman
        System.out.println(s2.SchoolName); // Aman
        System.out.println(s3.SchoolName); // Aman



    }
}


class Students{
    String name;
    int age;

    static String SchoolName;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}

//------------------Block----------------------
class Example {
    void show() {
        {
            // normal block
            int x = 10;
            System.out.println("Array.RevisionArray.Normal block, x = " + x);
        }
    }
}


