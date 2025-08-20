package String;

public class Practice_10 {

    public static void nonRepeated(String str){
        char count = 0;
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            boolean repeated = false;

            for (int j=0; j<str.length(); j++){
                if (i != j && str.charAt(j) == ch){
                    repeated = true;
                    break;
                }
            }
            if (!repeated){
                count = ch;
                break;
            }
        }
        if (count != 0){
            System.out.println("First non repeated char : "+ count);
        }else {
            System.out.println("No non-repeated form found");
        }

    }

    public static void main(String[] args) {
        String str = "swiss";
        nonRepeated(str);

    }
}
