package FunctionAndMethod;

import java.util.Scanner;



public class Swap {

    public static void Swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = "+ a);
        System.out.println("a = "+ b);

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Swap(a,b);

    }
}
