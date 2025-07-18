package Array;

public class StringLS {

    public static int StringLinearSearch(String name[] , String key){
        for (int i=0; i<name.length; i++){
            if (name[i] == key){
                return  i;
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        String name[] = {"Golu", "devdas", "mohan", "sohan", "nobody"};
        String key = "rohan";

        int index = StringLinearSearch(name , key);
        if (index == -1){
            System.out.println("Not found");
        }else {
            System.out.println("Match found on this index "+ index);
        }
        System.out.println();
    }
}
