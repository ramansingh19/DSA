package ConditionalStatement;

import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int tax;
        if (a < 50000){
            tax = 0;
            System.out.println("0% tax applied : " +tax);
        } else if (a > 500000 && a < 1000000) {
            tax = (int) (a*0.2f);
            System.out.println("20% tax applied : " +tax);
        } else if (a > 300000) {

            tax = (int) (a*0.3f);
            System.out.println("30% tax applied : " +tax);
        }
    }
}
