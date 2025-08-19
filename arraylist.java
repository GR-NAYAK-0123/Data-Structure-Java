import java.util.*;
import java.util.Scanner;

public class arraylist {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            ArrayList<Integer>list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);

            System.out.println(list);
            System.out.println(list.get(3));
            list.remove(2);
            System.out.println(list);
            list.set(0,0);
            System.out.println(list);
            list.add(1,1);
            System.out.println(list);
            System.out.println(list.contains(5));

            ArrayList<ArrayList<Integer>>mainlist = new ArrayList<>();
            ArrayList<Integer>list1 = new ArrayList<>();
            ArrayList<Integer>list2 = new ArrayList<>();
            ArrayList<Integer>list3 = new ArrayList<>();
            ArrayList<Integer>list4 = new ArrayList<>();
            list4 = list3;
            System.out.println(list4);

            for(int i = 1;i<=5;i++){
                list1.add(i * 1);
                list2.add(i * 2);
                list3.add(i * 3);
            }

            mainlist.add(list1);
            mainlist.add(list2);
            mainlist.add(list3);

            System.out.println(mainlist);
            sc.close();
        }
    }
}
