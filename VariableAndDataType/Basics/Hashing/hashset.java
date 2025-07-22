package Hashing;
import  java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        //inseration
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);

        //search contains
        if (set.contains(1)){
            System.out.println("set contain 1");
        }
        if(!set.contains(8)){
            System.out.println("not present");
        }

        // deletion
        set.remove(1);
        if (!set.contains(1)){
            System.out.println("1 is deleted");
        }

        // iterator
        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
