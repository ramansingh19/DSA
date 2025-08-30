package OOPs.Problems;

public class Problem_13 {
    public static void main(String[] args) {

        Caluclator c = new Caluclator();

        int sum = c.add(4,6);
        System.out.println(sum);

        double sum1 = c.add(9000,80866);
        System.out.println(sum1);
    }
}

class Caluclator{

    int add(int a , int b){
        return a+b;
    }

    double add(double a , double b){
        return a+b;
    }

}
