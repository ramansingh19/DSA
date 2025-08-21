package Loops.ForLoop;

import java.util.Scanner;

public class divisibleby10 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            for (;;) { // Infinite loop
                System.out.println("Enter your number : ");
                int n = sc.nextInt();

                if (n % 10 == 0) {
                    break;
                }

                System.out.println(n);
            }

            sc.close(); // optional, but good practice
        }
}


