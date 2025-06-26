package Basic;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float side = sc.nextFloat();
        float res = side * side;
        System.out.println(res);
    }
}
