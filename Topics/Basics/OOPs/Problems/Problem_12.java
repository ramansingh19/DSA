package OOPs.Problems;

public class Problem_12 {
    public static void main(String[] args) {

        Shapes s = new Shapes();
        s.display();

        Circles c = new Circles();
        c.display();
    }
}

//Super keyword
class Shapes{
    void display(){
        System.out.println("show us your talent");
    }
}

class Circles extends Shapes{
    @Override
    void display(){
        super.display();
        System.out.println("anything");
    }
}
