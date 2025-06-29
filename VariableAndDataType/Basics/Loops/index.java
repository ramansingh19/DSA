package Loops;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        int i = 1;
        while (i <= user){
            System.out.print(i + " ");
            i++;
        }

    }
}
