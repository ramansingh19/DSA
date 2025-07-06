package FunctionAndMethod;

import java.util.Scanner;

public class Sum {

    public static int Sum(int a , int b){
        int sum = a + b;
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = Sum(a,b);
        System.out.println("Result of two number is : " + result);

    }
}
