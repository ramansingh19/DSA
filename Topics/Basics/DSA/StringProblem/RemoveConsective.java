package DSA.StringProblem;

public class RemoveConsective {

    public static String removeConsecutive(String  str){
        str = str.toLowerCase();
        String result = " ";

        result += str.charAt(0);
        for (int i=1; i<str.length(); i++){
            char ch = str.charAt(i);

            if (ch != str.charAt(i-1)){
                result += ch;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        String str = "abcbb";
        System.out.println(removeConsecutive(str));
    }
}
