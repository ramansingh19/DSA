package String;

public class Duplicate {

    public static void getDuplicate(String str) {
        String count = " ";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (count.indexOf(ch) == -1) {
                count += ch;
            }
        }
        System.out.println("After removing all duplicate : " + count);
    }

    public static void main(String[] args) {
        String str = "Disco Disco ";










        getDuplicate(str);

    }
}
