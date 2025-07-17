package Array;

public class basics2 {

    public static void update(int num[]){
        for (int i=0; i<num.length; i++){
            num[i] = num[i] + 1;
        }
    }

    public static void main(String[] args) {
        int num[] = {90,89,99};
        update(num);
        for (int i=0; i<num.length; i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}
