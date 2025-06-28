package ConditionalStatement;

import java.util.Scanner;

public class largestnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a > b && b < a){
            System.out.println("a is largest number");
        }else if(b > a && a < b){
            System.out.println("b is largest number");
        }
    }
}
