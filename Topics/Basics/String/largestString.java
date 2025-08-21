package String;

public class largestString {

    //Using lexicographic method where we compare these with first letter

    public static void largestNumber(String str[]){
        String largest = str[0];
        for (int i=1; i< str.length; i++){
           if ( largest.compareTo(str[i]) < 0){
               largest = str[i];
           }
        }
        System.out.println(largest);
    }

    public static void main(String[] args) {
        String str[] = {"Raman", "Aman", "Ravi", "computer"};
        largestNumber(str);
    }
}
