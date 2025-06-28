package ConditionalStatement;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A :");
        int a = sc.nextInt();
        System.out.println("Enter B :");
        int b = sc.nextInt();
        System.out.println("Enter operator :");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case '+' :
                System.out.println(a+b);
                break;
            case '-' :
                System.out.println(a-b);
                break;
            case '*' :
                System.out.println(a*b);
                break;
            case '/' :
                System.out.println(a/b);
                break;
            case '%' :
                System.out.println(a%b);
                break;
            default:
                System.out.println("You choose wrong operator");
        }
    }
}
