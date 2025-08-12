package TwoDArray;

public class findthenumber {

    public static boolean findNumber(int arr[][] , int target) {

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == target) {
                    System.out.println("Found at (" + i + "," + j + ")");
                    found = true;
                }
            }
        }
        return found;
    }


    public static void main(String[] args) {
        int arr[][] = {{4,7,8},
                        {8,8,7}};
        int target = 7;
        if (findNumber(arr, target)){
            System.out.println("Element found : "+  target);
        }else{
            System.out.println("Element not found");
        }
    }
}
