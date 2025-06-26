import java.util.Scanner;

public class TypePromotion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        char ch = 'a';
//        char ch1 = 'b';
//        System.out.println((int)ch);
//        System.out.println((int)ch1);
//        System.out.println(ch-ch1);

        int a = 90;
        float b = 100.50f;
        long c = 900;
        double d = 743.59d;
        double res = a + b + c + d;
        System.out.println(res);
    }
}
