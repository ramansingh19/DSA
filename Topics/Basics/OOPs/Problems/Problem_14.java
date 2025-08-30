package OOPs.Problems;

public class Problem_14 {
    public static void main(String[] args) {
        vehicle v = new vehicle();
        v.run();

        vehicle c = new Bike();
        c.run();

        vehicle b = new car();
        b.run();

        car a = new car();
        a.run();

        Bike m = new Bike();
        m.run();
    }
}

//over riding
class vehicle{
    void run(){
        System.out.println("car move toward the river");
    }
}

class car extends vehicle{
    @Override
    void run(){
        System.out.println("Going toward the Ladakh");
    }
}

class Bike extends car{
    @Override
    void run(){
        System.out.println("One of the groups of 6 people going toward the pangangolake");
    }
}
