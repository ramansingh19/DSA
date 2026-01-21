package Array.RevisionArray.Hard;

public class Sortof0s1ws2s {
    public static int Sortof0s1s2s(int[] arr){
        int low = 0, mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;
            }
            else if (arr[mid] == 1) {
                mid++;
            }
            else { // arr[mid] == 2
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,0,0,2,1};
        int result = Sortof0s1s2s(arr);

        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
