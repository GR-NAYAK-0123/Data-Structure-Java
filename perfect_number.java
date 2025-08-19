import java.util.Scanner;

public class perfect_number {
    public static void perfect(int n){
        int sum = 0;
        for(int i = 1;i<n;i++){
            if(n % i == 0){
                sum = sum + i;
            }
        }
        if(sum == n){
            System.out.println("It is a perfect number");
        }
        else{
            System.out.println("It is not a perfect number");
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            perfect(n);
        }
    }
}
