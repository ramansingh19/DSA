package FunctionAndMethod;

import java.util.Scanner;

public class FactorialNumber {

    public static int factorial(int n) {
        int f = 1;
        for (int i=1; i<=n; i++){
            f *= i;
        }
        return f;

    }


    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        System.out.println(factorial(5));
//        int result = factorial(n);
//        System.out.println("Factorial of number is :" +result);
    }
}


