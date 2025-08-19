import java.util.Scanner;

public class primeNo_usingFunction {
    public static boolean prime(int n){
        if(n == 2){
            return true;
        }
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            boolean primeNo = prime(n);
            if(primeNo == false){
                System.out.println("It is not a prime number");
            }
            else{
                System.out.println("It is a prime number");
            }
        }
    }
}
