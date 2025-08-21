package ConditionalStatement;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your temperature :");
        double temp = sc.nextDouble();
        if(temp >= 100){
            System.out.println("You are suffering from fever go take medicine");
        }else{
            System.out.println("You don't have faver");
        }
    }
}
