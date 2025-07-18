package Array;

public class binarySearch {

    public static  int BinarySearch(int arr[] , int key){
        int start = 0 , end = arr.length - 1;
        while (start <= end){
            int mid = (start + end) / 2;
            if (arr[mid] == key){
                return  mid;
            }
            if (arr[mid] < key){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,11,12,13,14};
        int key = 11;

        System.out.println("no. of index is : "+ BinarySearch(arr , key));
    }
}
