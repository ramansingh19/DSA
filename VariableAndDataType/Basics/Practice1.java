import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float earser = sc.nextFloat();
        double res = (pen + pencil + earser);
        double gst = (res * 18/100);
        double finalres = res + gst;
        System.out.println("bill of three items : " + finalres);

    }
}
