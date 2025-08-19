import java.util.Scanner;
import java.util.ArrayList;

public class Container_withMost_water {
    public static int calculate(ArrayList<Integer>list,int i,int j){
        int height = Math.min(list.get(i),list.get(j));
        int width = j - i;

        return height * width;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            ArrayList<Integer>list = new ArrayList<>();
            list.add(1);
            list.add(8);
            list.add(6);
            list.add(2);
            list.add(5);
            list.add(4);
            list.add(8);
            list.add(3);
            list.add(7);

            //Approach - 1 (brut force) - 0(n^2)

            // int maxwater = 0;

            // for(int i = 0;i<list.size();i++){
            //     for(int j = i+1;j<list.size();j++){
            //         int water = calculate(list,i,j);
            //         maxwater = Math.max(maxwater,water);
            //     }
            // }
            // System.out.println(maxwater);


            //Approach - 2 (Two pointer) - 0(n)

            int maxwater  = 0;
            int var1 = 0;
            int var2 = list.size()-1;

            while(var1 != var2){
                int water = calculate(list, var1, var2);
                maxwater = Math.max(maxwater,water);
                if(list.get(var1) < list.get(var2)){
                    var1++;
                }
                else{
                    var2--;
                }
            }

            System.out.println(maxwater);
            sc.close();
        }
    }
}
