package Array;

public class reverse {
    public static void main(String[] args) {
        int num[] = {-2,4,6,8,10,18,29,10,309};
        int l = num.length;
        int temp;
        int a = Math.floorDiv(l, 2);
        for (int i=0; i<a; i++){
            temp = num[i];
            num[i] = num[l-i-1];
            num[l-i-1] = temp;

        }
        for (int i = 0; i < l; i++) {
            System.out.print(num[i] + " "); // or any logic
        }

//        for (int i:num){
//            System.out.print(i + " ");
//        }

    }
}
