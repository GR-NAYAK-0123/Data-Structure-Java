import java.util.*;
import java.util.Scanner;

public class Pair_sum {
    public static boolean pairSum1(ArrayList<Integer>list,int target){
        //Approach - 2 (Two pointer) - 0(n)

        int var1 = 0;
        int var2 = list.size()-1;

        while(var1 != var2){
            if(list.get(var1) + list.get(var2) == target){
                return true;
            }
            else if(list.get(var1) + list.get(var2) > target){
                var2--;
            }
            else{
                var1++;
            }
        }
        return false;
    }
    public static boolean pairSum(ArrayList<Integer>list,int target){
        //Approac - 1 (brut force) - 0(n^2)

        for(int i = 0;i<list.size();i++){
            for(int j = i+1;j<list.size();j++){
                if(list.get(i) + list.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            ArrayList<Integer>list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            list.add(6);

            int target = 7;

            System.out.println(pairSum1(list, target));
            sc.close();
        }
    }
}
