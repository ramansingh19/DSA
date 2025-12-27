package Array.RevisionArray.Normal;

public class reverseArray {
    public static int majorityNumber(int arr[]){
        int n = arr.length;

        for (int i=0; i<n; i++){
            int freq = 0;
            for (int j=0; j<n; j++){
                if (arr[i] == arr[j]){
                    freq++;
                }
            }
            if (freq > n/2){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {3,2,3};
        System.out.println(majorityNumber(arr));
    }
}