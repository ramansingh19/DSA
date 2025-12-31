package Array.RevisionArray.Medium;

public class frequencyofNumber {
    public static void freqofNumber(int arr[]){

        int freq[] = new int[arr.length];
        int visited = -1 ;

        for (int i=0; i<arr.length; i++){
            if (arr[i] == visited) continue;

            int count = 1;

            for (int j=i+1; j<arr.length; j++){
                if (arr[i] == arr[j]){
                    count++;
                    freq[j] = visited;
                }
            }
            freq[i] = count;
        }
        for (int i=0; i<freq.length; i++){
            System.out.println(arr[i] + "--> " + freq[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,2,3,5};
        freqofNumber(arr);


    }
}
