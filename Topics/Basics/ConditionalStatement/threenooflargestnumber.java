package ConditionalStatement;

import java.util.Scanner;

public class threenooflargestnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c){
            System.out.println("a is largest number");
        } else if (b > a && b > c) {
            System.out.println("B is largest number");

        } else if (c > a && c > b) {
            System.out.println("C is largest number");
        }
    }
}
