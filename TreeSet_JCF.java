import java.util.*;

public class TreeSet_JCF {
    public static void main(String args[]){
        TreeSet<String> set = new TreeSet<>();

        set.add("Kolkata");
        set.add("Ahmedabad");
        set.add("Bengaluru");
        set.add("Odisha");

        for (String str : set) {
            System.out.println(str);
        }
    }
}
