package Array.RevisionArray.Medium;

public class firstnonReapeatedEle {
    public static int firstNonRep(int arr[]){
        for (int i=0; i<arr.length; i++) {
            boolean isRepeated = false;
            for (int j=0; j<arr.length; j++){
                if (i != j && arr[i] == arr[j]){
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,2,3,19};
        System.out.println( firstNonRep(arr));
    }
}
