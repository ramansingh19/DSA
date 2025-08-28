package OOPs;

public class Abstraction {
    public static void main(String[] args) {

        Horse h = new Horse();
        h.eat();
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.walk();
        System.out.println(c.color);

        Mustang m = new Mustang();


    }
}


abstract class Animalss{
    //Constructor
    Animalss(){
        System.out.println("Animal hierarchy called... ");
    }
    String color;
//    Animalss(){
//        color = "Brown";
//    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}


class Horse extends Animalss{
   Horse(){
       System.out.println("Horse hierarchy called... ");
   }
    void changeColor(){
        color = "Black";
    }
    void walk(){
        System.out.println("walk in the garden");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang hierarchy called... ");
    }
}


class Chicken extends Animalss{

    void changeColor(){
        color = "White";
    }
    void walk(){
        System.out.println("The Chicken leg is to Tasty");
    }
}
