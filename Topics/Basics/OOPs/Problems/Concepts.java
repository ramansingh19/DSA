package OOPs.Problems;

public class Concepts {
    public static void main(String[] args) {
        //you can write parent reference = child object
        //Vehicle --> reference ,, car --> Object
        Vehicle  v = new Car();
        v.run();
        //this is not happening
//        Car c = new Vehicle();

        Vehicle v2 = new Vehicle();
        v2.run();
    }
}

class Vehicle {
    void run(){
        System.out.println("run at 120km/hr.");
    }
}

class Car extends Vehicle{
    void run(){
        System.out.println("faster run at 200km/hr.");
    }
}