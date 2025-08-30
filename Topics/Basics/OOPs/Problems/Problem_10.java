package OOPs.Problems;

public class Problem_10 {
    public static void main(String[] args) {

            Animal a1 = new Animal();
            a1.sound();   // Calls Animal's method

            Dog d1 = new Dog();
            d1.sound();   // Calls Dog's overridden method

            // Polymorphism
            Animal a2 = new Dog();
            a2.sound();   // Calls Dog's method (runtime polymorphism)
    }
}

//Single inheritance
class Animal{
     void sound(){
         System.out.println("Bark");
     }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Barks");
    }
}