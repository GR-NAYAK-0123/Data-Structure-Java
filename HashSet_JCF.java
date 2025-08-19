import java.util.*;

public class HashSet_JCF {
    public static void main(String args[]){
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(5);
        set.add(1);
        set.add(null);

        // Iteration on sets

        // Way - 1
        // Iterator i = set.iterator();

        // while(i.hasNext()){
        //     System.out.println(i.next());
        // }

        // Way - 2

        for (Integer i : set) {
            System.out.println(i);
        }


        // set.remove(2);
        // System.out.println(set);
        // System.out.println(set.size());
    }
}
