package OOPs;

public class inheritnace_Practices {
    public static void main(String[] args) {
        mammel ma = new mammel();
        ma.tuna();
        ma.human();
        ma.cat();
        ma.eat();
    }

}

class Animals extends Animal{
    String color;

    void eat(){
        System.out.println("they have to eat");
    }
}

class Fishs extends Animals{
    int fins ;

    void swim(){
        System.out.println("they can swim");
    }

    void tuna(){
        System.out.println("tuna fish");
    }

    void shark(){
        System.out.println("big fish");
    }
}

class Bird extends Fishs{
    int birds;

    void peacock(){
        System.out.println("peacock");
    }
}

class mammel extends Fishs{
    int mammel;

    void dog(){
        System.out.println("jerman ceferd");
    }

    void cat(){
        System.out.println("cat");
    }

    void human(){
        System.out.println("men, women, trans-gender");
    }
}