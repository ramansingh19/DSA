package Array.RevisionArray;

public class secondSmall {
    public static int secondSmallest(int arr[]){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i=0; i<arr.length; i++){
            if (arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        return  secondSmallest;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,1,8,10};
        int result = secondSmallest(arr);

        if (result == Integer.MAX_VALUE){
            System.out.println("not second smallest");
        }else {
            System.out.println("it is" + result);
        }
    }
}
