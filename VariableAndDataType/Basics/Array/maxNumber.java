package Array;

public class maxNumber {
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        int max = num[0];
        for (int i=1; i< num.length; i++){
            if (num[i]>max){
                max = num[i];
            }
        }
        System.out.println("Maximum number is : "+ max);
    }

}
