package DSA.ArrrayProblems;

import java.util.HashSet;

public class Practice {

//    public static boolean twoValue(int arr[]){
//        for (int i=0; i<arr.length-1; i++){
//            for (int j=i+1; j < arr.length; j++){
//                if (arr[i] == arr[j]){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
    //0(n2)

    public static boolean twoValue(int arr[]){
        HashSet<Integer> seen = new HashSet<>();
        for (int i=0; i< arr.length; i++){
            if (seen.contains(i)){
                return true;
            }
            seen.add(i);
        }
        return false;
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(twoValue(arr));
    }
}
