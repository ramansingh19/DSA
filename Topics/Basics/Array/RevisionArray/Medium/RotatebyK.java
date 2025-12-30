package Array.RevisionArray.Medium;

public class RotatebyK {
      public static void reverse(int arr[] , int start , int end){

        while (start < end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int k =3;
        int n = arr.length;

        //check if k is bigger than n;
        k = k % n;

        reverse(arr , 0 , n-1);
        reverse(arr , 0 , k-1);
        reverse(arr , k, n-1);

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
