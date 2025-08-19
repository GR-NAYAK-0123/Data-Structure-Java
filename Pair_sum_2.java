// import java.util.*;

public class Pair_sum_2 {
    public static void main(String args[]){
        int nums[] = {11,15,6,8,9,10};
        int n = nums.length;
        int target = 16;
        int point = -1;
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i] > nums[i+1]){
                point = i;
            }
        }
        int var1 = point+1;
        int var2 = point;

        int res[] = new int[2];

        while(var1 != var2){
            if(nums[var1] + nums[var2] == target){
                res[0] = var1;
                res[1] = var2;
            }
            if(nums[var1] + nums[var2] > target){
                var2 = (n + var2 - 1) % n;
            }
            else{
                var1 = (var1 + 1) % n;
            }
        }
        for(int i = 0;i<res.length;i++){
            System.out.print(res[i] + " ");
        }
        System.out.println();
    }
}
