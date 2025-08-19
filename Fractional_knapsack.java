import java.util.*;

public class Fractional_knapsack {
    public static void main(String args[]){
        int weight[] = {20,30,10};
        int value[] = {100,120,60};
        int w = 50;
        double arr[][] = new double[weight.length][3];

        for(int i = 0;i<weight.length;i++){
            arr[i][0] = weight[i];
            arr[i][1] = value[i];
            arr[i][2] = value[i] / (double)weight[i];
        }

        Arrays.sort(arr,Comparator.comparingDouble(o -> o[2]));
        int maxValue = 0;
        for(int i = arr.length-1;i>=0;i--){
            if(w >= arr[i][0]){
                maxValue+=arr[i][1];
                w-=arr[i][0];
            }
            else{
                maxValue+= w * arr[i][2];
                break;
            }
        }
        System.out.println("Maximum value is " + maxValue);
    }
}
