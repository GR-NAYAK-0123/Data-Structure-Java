import java.util.Scanner;

public class max_subArray_sum {
    public static void maxSubArray_sum(int number[]){
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for(int i = 0;i<number.length;i++){
            for(int j = i;j<number.length;j++){
                int sum = 0;
                for(int k = i;k<=j;k++){
                    sum = sum + number[k];
                    System.out.print(number[k] + " ");
                }
                if(sum > maxSum){
                    maxSum = sum;
                }
                if(minSum > sum){
                    minSum = sum;
                }
                System.out.println();
                System.out.println("Sum = " + sum);
            }
            System.out.println();
        }
        System.out.println("Maximum sub array sum is: " + maxSum);
        System.out.println("Minimum sum is: " + minSum);
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the size: ");
            int n = sc.nextInt();
            int number[] = new int[n];
            for(int i = 0;i<n;i++){
                System.out.print("Enter the element of index " + i +":");
                number[i] = sc.nextInt();
            }
            maxSubArray_sum(number);
        }
    }
}
