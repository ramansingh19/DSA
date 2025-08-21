package String;

public class Practice_06 {
    public static void main(String[] args) {
        String name = "Raman";
        String rev = "";

        name = name.toLowerCase();
        for (int i=name.length()-1; i>=0; i--){
            rev = rev + name.charAt(i);
        }
        System.out.println(rev);

    }
}
