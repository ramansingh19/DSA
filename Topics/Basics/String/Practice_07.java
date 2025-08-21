package String;

public class Practice_07 {

    public static boolean Palindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
//        String str = "noon";
        int n = 121;
        String str = String.valueOf(n);
        System.out.println(Palindrome(str));
    }
}
