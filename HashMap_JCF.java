import java.util.*;

public class HashMap_JCF {
    public static void main(String args[]){
        HashMap<String,Integer> map = new HashMap<>();

        //Insert - O(1)
        map.put("Raja",20);
        map.put("Siba",14);
        map.put("Vijay",11);
        map.put("Shivam",17);

        //Iteration on HashMap
        Set<String> keys = map.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key = " + k + "," + "Value = " + map.get(k));
        }

        //System.out.println(map);

        //get - O(1)
        // System.out.println(map.get("Raja"));

        // //containsKey - O(1)
        // System.out.println(map.containsKey("Raja"));

        //remove - O(1)
        // System.out.println(map.remove("Siba"));
        // System.out.println(map.remove("papu"));

        //size - O(1)
        // System.out.println(map.size());

        // //isEmpty()
        // System.out.println(map.isEmpty());

        // //clear
        // map.clear();

        // System.out.println(map.isEmpty());
    }
}
