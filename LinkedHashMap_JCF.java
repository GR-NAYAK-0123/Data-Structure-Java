import java.util.*;

public class LinkedHashMap_JCF {
    public static void main(String args[]){
        LinkedHashMap<String,Integer> lmap = new LinkedHashMap<>();

        lmap.put("India",100);
        lmap.put("China",150);
        lmap.put("US",50);

        System.out.println(lmap);
    }
}
