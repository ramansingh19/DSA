package Array.Binarysearch;

public class pairinArray {

    public static void pairinArray(int arr[]){
        int tp = 0;
        for (int i=0; i<arr.length; i++) {
            int curr = arr[i];//2,4,,6,8,10
            for (int j=i+1; j<arr.length; j++){
                System.out.print("(" + curr + "," + arr[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pair is  :"+ tp);
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14,16,66};

        pairinArray(arr);
    }
}
