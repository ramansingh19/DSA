package OOPs;

public class inheritance {
    public static void main(String[] args) {
        //this is object
        Fish shark = new Fish();
        shark.eat();

        Mammls walk = new Mammls();
        walk.swim();
    }

}

//Parent class
class Animal{
    String color ;

    void eat(){
        System.out.println("Eats");
    }

    void bark(){
        System.out.println("Barks");
    }
}

//child class / also it is single level inheritance(parent - child)
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims in water");
    }
}

//multi-level inheritance (parent-child-child)
class Mammls extends Fish{
    String color;

    void walk(){
        System.out.println("they can walk thousand of km to eat");
    }
}