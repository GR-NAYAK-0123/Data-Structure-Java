import java.util.Scanner;

public class power_x_n_recurssion {

    // Optimize logic with time complexity o(logn)
    public static int optimizePow(int x,int n){
        if(n == 0){
            return 1;
        }
        int half = optimizePow(x,n/2);
        int power = half * half;

        if(n % 2 != 0){
            power = x * power;
        }

        return power;
    }

    // Normal logic with time complexity o(n)
    public static int power(int x,int n){
        if(n == 1){
            return x * n;
        }
        int xPowNm1 = power(x,n-1);
        int xPowN = x * xPowNm1;
        return xPowN;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter x: ");
            int x = sc.nextInt();
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            System.out.println(optimizePow(x,n));
        }
    }
}
