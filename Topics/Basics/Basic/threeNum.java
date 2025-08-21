package Basic;

import java.util.Scanner;

public class threeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int input = (a + b + c) /3;
        System.out.println("Average Num is. " + input);
    }
}
