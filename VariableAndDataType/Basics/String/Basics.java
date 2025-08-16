package String;

import java.util.Scanner;

public class Basics {

    public static void Stringlength(String str){
        for (int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        char arr[] = {'a', 'b', 'c', 'd'};
//        String str = "raman";
//        String str2 = new String("Raman923ijijuw2w9u9321ui");
//
//
//        //input/output
//        Scanner sc = new Scanner(System.in);
//        String name;
//        name = sc.nextLine();
//        System.out.println(name);
//        System.out.println(str2);

        //find the length of String
//        String name = "Raman kumar";
//        System.out.println(name.length());

        //concatations
        String firstname = "Porche";
        String secondname = "911";
        String fullnname = firstname + " " + secondname;

        Stringlength(fullnname);

    }
}
