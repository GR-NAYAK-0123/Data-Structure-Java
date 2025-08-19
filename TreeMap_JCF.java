import java.util.*;

public class TreeMap_JCF {
    public static void main(String args[]){
        TreeMap<String,Integer> tmap = new TreeMap<>();

        tmap.put("India",100);
        tmap.put("China",150);
        tmap.put("US",50);

        System.out.println(tmap);
    }
}
