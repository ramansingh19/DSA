package String;

import java.util.Scanner;

public class Practice_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");
        String str = sc.nextLine();

        int count = 0;
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'e' || ch =='u'){
                count++;
            }
        }
        System.out.println("Count of vowels :"+ count);
    }
}
