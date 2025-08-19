import java.util.*;
import java.util.Scanner;

public class Swap_arrayList {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            ArrayList<Integer>list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);

            int temp = list.get(0);
            list.set(0,list.get(3));
            list.set(3,temp);

            System.out.println(list);
            sc.close();
        }
    }
}
