package ConditionalStatement;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int a = sc.nextInt();
        if (a >= 0){
            System.out.println("positive number");
        }else {
            System.out.println("Negative number");
        }
    }
}
