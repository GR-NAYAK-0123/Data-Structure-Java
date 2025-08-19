import java.util.Scanner;

public class kadanes_subArr_sum {
    public static void max_subArr_sum(int number[]){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i<number.length;i++){
            sum = sum + number[i];
            if(sum < 0){
                sum = 0;
            }
            maxSum = Math.max(maxSum,sum);
        }
        System.out.println("Maximum sum is " + maxSum);
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the size: ");
            int n = sc.nextInt();
            int number[] = new int[n];
            for(int i = 0;i<number.length;i++){
                System.out.print("Enter the element for index " + i +":");
                number[i] = sc.nextInt();
            }
            max_subArr_sum(number);
        }
    }
}
