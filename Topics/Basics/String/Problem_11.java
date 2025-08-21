package String;

public class Problem_11 {

    public static boolean getdigits(String str){
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            //this is use to find if any alphabet present in the string then they show the false .
            if (!Character.isDigit(ch)){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
//        int num = 123a45;
        String str = "123454";

        System.out.println(getdigits(str));

    }
}
