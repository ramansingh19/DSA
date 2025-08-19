package String;

public class Practice_04 {
    public static void main(String[] args) {
//        String str = "Raman".replace("1" , " ");
        String str = "Raman".replace("an" , " ");
        System.out.println(str);
    }
}
//
//This tells Java:
//        “Take the string Raman and replace every occurrence of 1 (digit one) with a space " ".”
//
//But inside "Raman", there is no "1" character at all.
//
//Since nothing matches, the replace() method does nothing and simply returns the original string "Raman".
