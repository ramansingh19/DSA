package Loops.ForLoop;

import java.util.Scanner;

public class Reverseoriginalno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        for(int i=n; i>0; i = i/10){
            int lastdigit = i % 10;
            rev = ((rev * 10) + lastdigit) ;

        }
        System.out.println(rev);
    }
}
