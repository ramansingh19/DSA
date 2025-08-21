package ConditionalStatement;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
          switch (n) {
              case 1 : System.out.println("Samosa");
              break;
              case 2 : System.out.println("litti chuckha");
              break;
              case 3 : System.out.println("darru");
              break;
              default:
                  System.out.println("laure lele mera");

          }
    }
}
