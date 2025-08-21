package Array;

public class Sum {
    public static void main(String[] args) {
        float num[] = {90.22f , 22.22f , 90.45f};
        float sum = 0;
        for (int i=0; i < num.length; i++){
            sum = sum + num[i];

        }
        System.out.print(sum);
    }
}
