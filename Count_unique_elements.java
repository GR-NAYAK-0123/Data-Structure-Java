import java.util.*;

public class Count_unique_elements {
    public static int countNumber(int nums[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }
        return set.size();
    }
    public static void main(String args[]){
        int nums[] = {4,3,2,5,6,7,3,4,2,1};
        System.out.println("The number of unique elements is " + countNumber(nums));
    }
}
