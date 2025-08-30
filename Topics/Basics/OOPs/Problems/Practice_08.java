package OOPs.Problems;

public class Practice_08 {
    public static void main(String[] args) {
        Carss c = new Carss("BMW" , "M4 Competition");
        Carss p = new Carss("Ford-mustang" , "1998");

        c.display();
        p.display();
    }
}

//Constructor
class Carss {
    String Brand;
    String model;

    Carss(String Brand, String model) {
        this.Brand = Brand;
        this.model = model;
    }


    void display() {
        System.out.println("Brand: " + Brand + ", Model: " + model);
    }
}