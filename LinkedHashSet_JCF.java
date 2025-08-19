import java.util.*;

public class LinkedHashSet_JCF {
    public static void main(String args[]){
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Odisha");
        set.add("Kolkata");
        set.add("Bengaluru");

        Iterator<String> it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
