import java.util.Scanner;

public class prefix_subArr_sum {
    public static void maxSum_arr(int number[]){
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];

        prefix[0] = number[0];
        for(int i = 1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + number[i];
        }
        
        int sum = 0;
        for(int i = 0;i<number.length;i++){
            for(int j = i;j<number.length;j++){
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];

                if(sum > maxSum){
                    maxSum = sum;
                }
            }

        }
        System.out.println("Maximum sum is " + maxSum);
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int number[] = {1,2,3,4,5};
            maxSum_arr(number);
            sc.close();
        }
    }
}
