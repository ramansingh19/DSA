package Pattern;

import java.util.Scanner;

public class starPattern {
    public static void main(String[] args) {
        for (int i=1; i<=4; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

}
