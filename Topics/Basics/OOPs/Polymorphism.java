package OOPs;

public class Polymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1,19));
        System.out.println(calc.sum((float) 0.1 , (float) 1.9));
        System.out.println(calc.sum(01,19,15));

        Deer eat = new Deer();
        eat.eat();
    }
}

//Method overriding
class Animall{
    void eat() {
        System.out.println("eat anything");
    }
}

class Deer extends Animall{
    void eat() {
        System.out.println("eat grass");
    }
}

//Method Overloading
class Calculator{
    int sum(int a, int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return  a+b+c;
    }
}
