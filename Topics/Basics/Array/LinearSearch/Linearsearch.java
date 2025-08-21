package Array.LinearSearch;

public class Linearsearch {

    public static int LinearSearch(int n[] , int key){
        for (int i=0; i<n.length; i++){
            if (n[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n[] = {2,4,6,8,10,12};
        String name[] = {"Raman", "Ravi", "Aman", "Golu"};
        int key = 20;

        int index = LinearSearch(n , key);
        if(index == -1){
            System.out.println("Not found");
        }else {
            System.out.println("Match found "+ index);
        }
        System.out.println();
    }
}
