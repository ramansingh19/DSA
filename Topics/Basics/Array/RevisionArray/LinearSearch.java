package Array.RevisionArray;

public class LinearSearch {
    public static int  name(String str[], String word){
        for (int i=0; i< str.length; i++){
            if (str[i] == word){
                return i;
            }
        }
        return -1;
    }
    public static int findNumber(int number[], int key){
        for (int i=0; i<=number.length-1; i++){
            if (number[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {2,3,4,5,6,7,8,9,10};
        String str[] = {"raman", "aman"};
        String word = "aman";
        int key = 5;

        int findname = name(str , word);
        if (findname == -1){
            System.out.print("not found ");
        }else {
            System.out.print("found at index "+ findname);
        }

//        int index = findNumber(number , key);
//        if (index == -1){
//            System.out.print("not found ");
//        }else {
//            System.out.print("found at index " + index);
//        }
//        System.out.println();
    }
}
