package Operstors;

public class unary {
    public static void main(String[] args) {
        //increment operator
        int a = 10;
//        int b = ++a;
        int b = a++;
        System.out.println(a);
        System.out.println(b);

        //decrement operator
        int q = 10;
        int c = --q;
//        int w = q--;
        System.out.println(q);
        System.out.println(c);
    }
}
