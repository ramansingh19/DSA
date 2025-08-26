package OOPs;

import jdk.jfr.Percentage;

public class Classes_Objects {
    public static void main(String[] args) {
        //constructor
        Pen p1 = new Pen();

        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());

//        //marks
//        marks m1 = new marks();
//        m1.setPercentage(80,70,90);
//        System.out.println("Overall percentage is : "+ m1.percentage);
//        m1.setAge(24);
//        System.out.println("Your Age is : "+ m1.age);

        //BankAccount
//        BankAccount Acc = new BankAccount();
//        Acc.username = "RamanSingh";
////        Acc.password = "ramna.07z";//not accessible bsz. of the private ;
//        Acc.setPassword("raman.07z");
//        System.out.println(Acc.username);
//
    }

}

//class BankAccount{
//    public String username;
//    private String password;
//    //you can use to access this like public , protected , default but not private
//     public void setPassword(String pwd){
//        password = pwd;
//        System.out.println(password);
//    }
//}

class Pen{
    private String color;
    private int tip;

    //Getters
    String getColor() {
        return this.color;
    }

    int getTip() {
    return this.tip;
    }

    //Setters
    void setColor(String newColor){
        this.color = newColor;
    }
    void setTip(int newTip){
        this.tip = newTip;
    }
}


//class marks{
//    String name ;
//    int age;
//    float percentage;
//
//    void setPercentage(int phy, int maths , int chem){
//      percentage = (phy+chem+maths)/3;
//    }
//    void setAge(int newAge){
//        age = newAge;
//    }
//}