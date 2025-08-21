package Array.LinearSearch;

public class minNUMBer {
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        int min = num[0];
        for (int i=1; i< num.length; i++){
            if (num[i] < min) {
                min = num[i];  // update min if current is smaller
            }
        }
        System.out.println("Maximum number is : "+ min);
    }
}
