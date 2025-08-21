package ConditionalStatement;

import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String str = (a>=33) ? "Pass" : "Fail";
        System.out.println(str);
//        int n = 9;
//        String str = ((n % 2) ==0) ? "even" : "odd";
//        System.out.println(str);


    }
}
