package String;

public class longestSubstring {

    //getting substring without any repeation for string
    public static String getsubstring(String str) {
        int maxLen = 0;
        String longest = " ";
        int n = str.length();

        for (int i = 0; i < n - 1; i++) {
            String result = "";
            for (int j = i; j <= n - 1; j++) {
                char ch = str.charAt(j);
                if (result.indexOf(ch) != -1) {
                    break;
                }
                result += ch;
                if (result.length() > maxLen) {
                    maxLen = result.length();
                    longest = result;
                }
            }
        }
        return longest;

    }

    //this is for the number
    public static int getsubstring1(String str) {
        int maxLen = 0;
        int n = str.length();

        for (int i = 0; i < n - 1; i++) {
            String result = "";
            for (int j = i; j <= n - 1; j++) {
                char ch = str.charAt(j);
                if (result.indexOf(ch) != -1) {
                    break;
                }
                result += ch;

                maxLen = Math.max(maxLen, result.length());
            }
        }
        return maxLen;

    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(getsubstring(str));
        System.out.println(getsubstring1(str));
    }
}
