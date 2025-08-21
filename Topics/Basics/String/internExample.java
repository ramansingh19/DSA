package String;

public class internExample {
    public static void main(String[] args) {
        String str1 =  "raman";
        String str2 = new String("raman");

        //gives false
        System.out.print(str1 == str2);

        //using intern function
        String str3 = str2.intern();
        System.out.println(str3 == str1);
    }
}
