package OOPs.Problems;

public class Problem_03 {
    public static void main(String[] args) {
        Shape s = new Circle();   // runtime polymorphism
        s.display();              // calls Circle's version
    }
}

class Shape {
    protected void display() {
        System.out.println("Display-Base");
    }
}

class Circle extends Shape {
    @Override
    public void display() {   // can be public or protected
        System.out.println("Display-Derived");
    }
}
