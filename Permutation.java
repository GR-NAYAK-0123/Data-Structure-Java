import java.util.*;

public class Permutation {
    public static void permutation(int nums[],List<List<Integer>>mainlist,List<Integer>list,boolean arr[]){
        if(list.size() == nums.length){
            mainlist.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0;i<nums.length;i++){
            if(!(arr[i])){
                list.add(nums[i]);
                arr[i] = true;
                permutation(nums, mainlist, list, arr);
                list.remove(list.size()-1);
                arr[i] = false;
            }
        }
    }
    public static void main(String args[]){
        int nums[] = {1,2,3};
        boolean arr[] = new boolean[nums.length];
        List<List<Integer>>mainlist = new ArrayList<>();
        List<Integer>list = new ArrayList<>();
        permutation(nums, mainlist, list, arr);
        System.out.println(mainlist);
    }
}
