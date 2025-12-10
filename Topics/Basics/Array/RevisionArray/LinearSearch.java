package Array.RevisionArray;

public class LinearSearch {
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
        int key = 5;

        int index = findNumber(number , key);
        if (index == -1){
            System.out.print("not found ");
        }else {
            System.out.print("found at index " + index);
        }
        System.out.println();
    }
}
