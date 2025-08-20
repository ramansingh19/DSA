package String;

public class Practice_08 {

    public static void Occurrence(String str){
        int count = 0;
        char target = 'a';
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) == target){
                count++;
            }
        }
        System.out.println("Occurrence of "+ target + " : "+ count);
    }

    public static void main(String[] args) {
        String str = "Raman";
        Occurrence(str);
    }
}
