import java.util.Scanner;

public class tilling_prblm_recurssion {
    public static int tilling(int n){
        // base case
        // base case sets until the size of (breadth - 1) = 1;
        if(n == 0 || n == 1){
            return 1;
        }

        int fNm1 = tilling(n-1);
        int fNm2 = tilling(n-2);

        int totways = fNm1 + fNm2;
        return totways;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            System.out.println(tilling(n));
        }
    }
}
