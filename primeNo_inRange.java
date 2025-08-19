import java.util.Scanner;

public class primeNo_inRange {
    public static int isPrime(int n){
        if(n == 2){
            return 1;
        }
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n % i == 0){
                return 0;
            }
        }
        return 1;
    }

    public static void primeInRange(int n){
        for(int i = 2;i<=n;i++){
            int prime = isPrime(i);
            if(prime == 1){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            primeInRange(n);
        }
    }
}
