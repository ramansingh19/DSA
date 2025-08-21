package Array.Binarysearch;

public class reverseNumber {

    public static void reverseNumber(int n[]){
        int start = 0, end = n.length - 1;
        while (start < end){
            int temp = n[end];
            n[end] = n[start];
            n[start] = temp;

            start++;
            end--;

        }
    }

    public static void main(String[] args) {
        int n[] = {2,4,6,8,10};

        reverseNumber(n);
        for (int i=0; i<n.length; i++){
            System.out.print(n[i] + " ");
        }
        System.out.println();
    }
}
