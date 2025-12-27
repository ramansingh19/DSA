package Array.RevisionArray.Normal;

public class maxSum {
    public static void subMaxprefix(int arr[] ){

        int currsum = 0;
        int max = Integer.MIN_VALUE;

        int prefix[] = new int[arr.length];

        //calculation of prefix
        prefix[0] = arr[0];
        for (int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for (int i=0; i<arr.length; i++){
            int start = i;
            for (int j=i; j<arr.length; j++){
                int end = j;
                currsum = start ==0 ? prefix[end] :  prefix[end] - prefix[start-1];


//                for (int k=start ; k<=end; k++){
//                    currsum += arr[k];
//                }

                System.out.print(currsum);
                if (max < currsum){
                    max = currsum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("maxsum"+ max);
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        subMaxprefix(arr);
    }
}
