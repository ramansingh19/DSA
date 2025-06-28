package ConditionalStatement;

import java.util.Scanner;

public class iff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a >= 33){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }
    }
}
