package OOPs;

class Solution{
    public static void main(String[] args) {
        Complex c = new Complex(4,5);
        Complex d = new Complex(9,4);

        Complex e = Complex.Sum(c,d);
        Complex f = Complex.diff(c,d);
        Complex g = Complex.product(c,d);

        e.PrintComplex();
        f.PrintComplex();
        g.PrintComplex();
    }
}


class Complex{
    int real;
    int imag;
    public Complex(int r , int i){
        real = r;
        imag = i;
    }

    public static  Complex Sum(Complex a , Complex b){
        return new Complex((a.real + b.real), (a.imag + b.imag));
    }

    public static Complex diff(Complex a , Complex b){
        return new Complex((a.real - b.real) , (a.imag - b.imag));
    }

    public static Complex product(Complex a, Complex b){
        return new Complex((a.real * b.real - a.imag * b.imag),
                (a.real * b.imag + a.imag * b.real));
    }
    public void PrintComplex(){
        if (real == 0 && imag != 0){
            System.out.println(imag + "i");
        }else if (imag ==0 && real != 0){
            System.out.println(real);
        }else {
            System.out.println(real+"+"+imag+"i");
        }
    }
}

//import java.security.PublicKey;
//import java.util.*;

//class Solution{
//    public static void main(String[] args) {
//        Complex c = new Complex(4,5);
//        Complex d = new Complex(9,4);
//
//        Complex e = Complex.Sum(c,d);
//        Complex f = Complex.Diff(c,d);
//        Complex g = Complex.Product(c,d);
//
//        e.PrintComplex();
//        f.PrintComplex();
//        g.PrintComplex();
//    }
//}
//
//class Complex{
//    int real;
//    int imag;
//    public Complex(int r , int i){
//        real = r;
//        imag = i;
//
//    }
//
//    public static Complex Sum(Complex a , Complex b){
//        return new Complex((a.real+b.real), (a.imag+b.imag));
//    }
//
//    public static Complex Diff(Complex a , Complex b){
//        return new Complex((a.real-b.real), (a.imag-b.imag));
//    }
//
//    public static Complex Product(Complex a , Complex b){
//        return new Complex((a.real * b.real - a.imag * b.imag),
//                (a.real * b.imag + a.imag * b.real));
//    }
//
//    public void PrintComplex(){
//        if (real ==0 && imag != 0){
//            System.out.println(imag+ "i");
//        } else if (imag == 0 && real != 0) {
//            System.out.println(real);
//        }else {
//            System.out.println(real + "+" + imag+ "i");
//        }
//    }
//}

//import java.util.Scanner;

//public class Problem_02 {
//    public static void main(String[] args) {
//        System.out.println("Enter your number");
//        Complex c = new Complex();
//        c.Product();
//        System.out.println(Complex.d);
//        c.Sum();
//        System.out.println(Complex.c);
//    }
//}
//
//class Complex{
//    static Scanner sc = new Scanner(System.in);
//    static int a = sc.nextInt();
//    static float b = sc.nextFloat();
//    static int c ;
//    static int d;
//
//
//    void Sum(){
//        c = (int) (a + b);
//    }
//
//    void Product(){
//        d =(int) (a * b) ;
//    }
//
//    void difference(){
//
//    }
//}
