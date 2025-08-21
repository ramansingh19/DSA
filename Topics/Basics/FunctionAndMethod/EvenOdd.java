package FunctionAndMethod;

import java.util.Scanner;

public class EvenOdd {

    public static boolean evenodd(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        if (evenodd(n)){
            System.out.println("Nnumber is Even");
        }else {
            System.out.println("number is odd");
        }
    }
}
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num;
//        System.out.print("Enter an integer: ");
//        num = sc.nextInt();
//        if (isEven(num)) {
//            System.out.println("Number is even");
//        } else {
//            System.out.println("Number is odd");
//
//        }
//    }
//
//    public static boolean isEven(int number) {
//        if (number % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//}