package OOPs;

public class Interfaces {
    public static void main(String[] args) {

//        Rook r = new Rook();
//        r.moves();
//
//        Queen q = new Queen();
//        q.moves();

        myfriend friend = new myfriend();
        friend.Both();
        friend.hunt();

        Dog d = new Dog();
        d.hunt();

        Deer de = new Deer();
        de.eat();

        Deers dee = new Deers();
        dee.veg();

    }
}

interface Herbivores{
    void veg();
}

interface Omnivores{
    void Both();
}

interface Carnivores{
    void hunt();
}

class Dog implements Omnivores , Carnivores{
    public void hunt(){
        System.out.println("Eat chicken");
    }
    public void Both(){
        System.out.println("Eat both chicken and grass");
    }

}

class Deers implements Herbivores{
    public void veg(){
        System.out.println("Eat only grass");
    }
}

class myfriend implements Omnivores, Carnivores{
    public void Both(){
        System.out.println("Eats veg for the survival");
    }

    public void hunt(){
        System.out.println("Eat chicken for the Taste --> Shubham");
    }
}

//interface ChessPlayer{
//    //this is blueprint
//    void moves();
//}
//
//class Queen implements ChessPlayer{
//    public void moves(){
//        System.out.println("up, down , lefty , right");
//    }
//}
//
//class Rook implements ChessPlayer{
//    public void moves(){
//        System.out.println("down , buttom, left , right ");
//    }
//}
//
//class King implements ChessPlayer{
//    public void moves(){
//        System.out.println("left , right , up , down");
//    }
//}