package Loops.whileLoop;

import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        for (int i=n; i<=n*10; i=i+n){
            if (i*2==0){
                System.out.println(" ");
            }

            System.out.println(i);
        }

    }
}

