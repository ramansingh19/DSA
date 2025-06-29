package Loops;

import java.util.Scanner;

public class naturalnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        int sum = 1;
        int i = 1;
        while (i <= user){
            sum = sum+i;
            i++;
        }

        System.out.println("sum is : "+sum);
    }
}
