package ConditionalStatement;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year :");
        int year = sc.nextInt();
        if(year % 4 ==0){
            System.out.println("This year is leap year");
        }else {
            System.out.println("this is not");
        }
    }
}
