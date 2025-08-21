package String;

public class Reverse {

    public static void Reverse(String str){
        String rev = "";
        str = str.toLowerCase();
        for (int i=str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
//        System.out.println(str);
        System.out.println(rev);
    }

    public static void main(String[] args) {
        String str = "Raman";
        Reverse(str);
    }
}
