package String;

import java.util.Arrays;

public class Practice_05 {
    public static void main(String[] args) {

        String str1 = "Raman";
        String str2 = "amanr";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()){
            System.out.print("not anagram");
        }else {
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if (Arrays.equals(arr1 , arr2)){
                System.out.print("Anagram");
            }else {
                System.out.print("not anagram");
            }
        }



//        String str1 = "listen";
//        String str2 = "silent";
//        //conert all to the lower case
//        str1 = str1.toLowerCase();
//        str2 = str2.toLowerCase();
//        //check for both length
//        if (str1.length() != str2.length()){
//            System.out.print("not anagram bcz the size of string is not same");
//        }else {
//            //convert sting array into char array
//            char[] arr1 = str1.toCharArray();
//            char[] arr2 = str2.toCharArray();
//            //sort the char array
//            Arrays.sort(arr1);
//            Arrays.sort(arr2);
//
//            boolean result = Arrays.equals(arr1 , arr2);
//            if (result){
//                System.out.print(str1 + " and " + str2 + " are anagram for each other");
//            }else {
//                System.out.print(str1 + " and "+ str2 + " is not anagram for each other");
//            }
//        }
    }
}
