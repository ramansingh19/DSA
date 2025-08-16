package String;

public class Palindrome {

    public static boolean palindrome(String str){
        for (int i=0; i<str.length()/2; i++){
            if (str.charAt(i) != str.charAt(str.length()-1-i)){
                return  false;
            }

        }
       return true;
    }

    public static void main(String[] args) {
//        String str = "noons";
        int num = 121;
        String str = String.valueOf(num);

        System.out.println(palindrome(str));
    }
}
