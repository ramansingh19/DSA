package String;

public class Vowels {

    public static void checkvowels(String vowels){
        vowels = vowels.toLowerCase();
        for (int i=0; i<vowels.length(); i++){
            char ch = vowels.charAt(i);
            if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'e'){
                System.out.print(ch + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String vowels = "RAMAN SINGH";
        checkvowels(vowels);
    }
}
