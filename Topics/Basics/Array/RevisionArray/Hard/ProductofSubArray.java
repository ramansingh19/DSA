package Array.RevisionArray.Hard;

public class ProductofSubArray {
    public static  int ProductofSubArray(int arr[]) {
        int max = arr[0];
        int min = arr[0];
        int result = arr[0];

        for (int i=1; i< arr.length; i++){
            int temp = max;
            max = Math.max(arr[i] , Math.max(max * arr[i] , min * arr[i]));
            min = Math.min(arr[i] , Math.min(temp * arr[i] , min * arr[i]));

            result = Math.max(result , max);
        }
        return  result;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,1,2,4};

        System.out.println(ProductofSubArray(arr));
    }
}
