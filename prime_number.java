import java.util.Scanner;

public class prime_number{
    public static void main(String args[]){
       try(Scanner sc = new Scanner(System.in)){
        int n = sc.nextInt();
        for(int i = 2;i<n;i++){
            if(n % i == 0){
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}
}