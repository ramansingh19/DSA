package OOPs.Problems;

public class Problem_05 {
    public static void main(String[] args) {
        new Bluecar();
    }
}

abstract class Vehicles {
    static {
        System.out.print("1");
    }

    public Vehicles (String name){
        super();
        System.out.print("2");
    }
    {
        System.out.print("3");
    }

}

 class Bluecar extends Vehicles{
    {
        System.out.print("4");
    }
    public Bluecar(){
        super("blue");
        System.out.print("5");
    }

}