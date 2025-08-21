package Array;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        int num[] = new int[100];

        System.out.println("length of array "+ num.length);
        Scanner sc = new Scanner(System.in);
        num[1] = sc.nextInt();
        num[2] = sc.nextInt();
        num[3] = sc.nextInt();

        System.out.println("Math number is : "+ num[1]);
        System.out.println("Chemistry number is : "+ num[2]);
        System.out.println("Physics number is : "+ num[3]);

        int marks = (num[1] + num[2] + num[3] ) / 3;
        System.out.println("percentage of 3 numbers : " + marks + "%");

        int mult = (num[1] * num[2] * num[3] );
        System.out.println("multiplication :"+ mult);



    }
}
