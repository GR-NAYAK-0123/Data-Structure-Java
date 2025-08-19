import java.util.*;
import java.util.Scanner;

public class Subset {
    public static ArrayList<ArrayList<Integer>>mainlist = new ArrayList<>();
    public static void subset(int nums[],ArrayList<Integer>list,int i){
        if(i == nums.length){
            mainlist.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[i]);
        subset(nums,list,i+1);
        list.remove(list.size()-1);
        subset(nums,list,i+1);
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int nums[] = {1,2,3,8};
            ArrayList<Integer>list = new ArrayList<>();
            subset(nums, list, 0);
            System.out.println(mainlist);
            sc.close();
        }
    }
}
