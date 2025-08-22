package DSA.ArrrayProblems;

public class Palindrome {

//    public static boolean palindrome(String str){
//        for (int i=0; i<str.length()/2; i++){
//            if (str.charAt(i) != str.charAt(str.length()-1-i)){
//                return  false;
//            }
//
//        }
//       return true;
//    }

    public static boolean palindrome(String str){
        str = str.toLowerCase();
        for (int i=0; i<str.length()/2; i++){
            int n = str.length();
            if (str.charAt(i) == str.charAt(n-1-i)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        String str = "noons";
        int num = 123;
        //this is to convert number into string
        String str = String.valueOf(num);

        System.out.println(palindrome(str));
    }
}
