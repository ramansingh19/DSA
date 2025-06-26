import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //print all the sentence
//        String str = sc.nextLine();
//        System.out.println(str);
//
//        int a = sc.nextInt();
//        System.out.println(a);

//        long l = sc.nextLong();
//        System.out.println(l);

//        Double d = sc.nextDouble();
//        System.out.println(d);

        //Sum
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int sum = a +b;
//        System.out.println(sum);

        //Product of two no
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int product = a * b;
//        System.out.println(product);

        //Area of circle = 3.14*rr;
        float rad = sc.nextFloat();
        //f is use to denote floating number , nahi too wo double leleta hai.
        float area = 3.14f * rad * rad;
        System.out.println(area);
    }
}
