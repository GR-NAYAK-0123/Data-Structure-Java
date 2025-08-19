import java.util.Scanner;

public class fibonacci_recurssion {
    public static int fib(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        int fibNm1 = fib(n-1);
        int fibNm2 = fib(n-2);
        int fibN = fibNm1 + fibNm2;
        return fibN;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            System.out.println(fib(n));
        }
    }
}
