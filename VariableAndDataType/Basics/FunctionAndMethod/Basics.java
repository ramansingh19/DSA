package FunctionAndMethod;

//import Basic.Sum;

import java.util.Scanner;

public class Basics {

    public static int multi(int a , int b) {
        int sum = a*b;
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = multi(a,b);
        System.out.println("multiplication is :" + sum);
    }
}

