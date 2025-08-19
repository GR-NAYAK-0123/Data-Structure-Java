import java.util.*;

public class Maximum_length_chain_pairs {
    public static void main(String args[]){
        int pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};

        //Sort the pairs on the basis of end time
        Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));

        int ans = 0;
        int last = -1;

        for(int i = 0;i<pairs.length;i++){
            if(pairs[i][0] > last){
                ans++;
                last = pairs[i][1];
            }
        }

        System.out.println("The maximum length of the chain is " + ans);
    }
}
