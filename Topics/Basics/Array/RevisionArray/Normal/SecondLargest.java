package Array.RevisionArray.Normal;

public class SecondLargest {
    public static int secondLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++) {

            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondlargest) {
                secondlargest = arr[i];
            }
        }
        return  secondlargest;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};

        int result = secondLargest(arr);

        if (result == Integer.MIN_VALUE){
            System.out.println("second largest not exist");
        }else {
            System.out.println("it is  " + result);
        }
    }
}
