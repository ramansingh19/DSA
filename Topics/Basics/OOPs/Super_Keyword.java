package OOPs;

public class Super_Keyword {
    public static void main(String[] args) {
        Horses hr = new Horses();
    }
}

class Dogs{
    Dogs(){
        System.out.println("Dogs class is called....... ");
    }
}

class Horses extends  Dogs{
    Horses(){
        super();
        System.out.println("Horse class is called.........");
    }
}

//constructor chaining --> learn