import java.util.Scanner;

public class sum_first_n_recurssion {
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        int sumNm1 = sum(n-1);
        int sumN = sumNm1 + n;
        return sumN;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            System.out.println("The sum is: " + sum(n));
        }
    }
}
