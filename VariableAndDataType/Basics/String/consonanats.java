package String;

public class consonanats {

    public static void Consonanat(String str){
        int consonant = 0;
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z'){
                if (!(ch == 'a' || ch == 'i' || ch == 'o' || ch == 'e' || ch == 'u' )){
                    consonant++;
                }
            }
        }
        System.out.println("consonant : "+ consonant);
    }

    public static void main(String[] args) {
        String str = "cat";
        Consonanat(str);

    }
}
