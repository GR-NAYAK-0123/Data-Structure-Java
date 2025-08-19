import java.util.Scanner;

public class Sum_of_N{
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int sum = 0;
            for(int i = 1;i<=n;i++){
                sum = sum + i;
            }
            System.out.println("The sum of above number is "+ sum);
        }
    }
}