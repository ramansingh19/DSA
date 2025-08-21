package FunctionAndMethod;

import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        System.out.println("Enter your number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isEven(n)){
            System.out.println("number "+ n + " is a palindrome number");
        }else {
            System.out.println("number "+ n + " is not a palindrome number");
        }

    }

    public static boolean isEven(int num) {
        int palindrome = num;
        int reverse = 0;

        while (palindrome!=0){
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome/10;

        }
        if (num == reverse){
            return true;
        }else {
            return false;
        }
    }
}
