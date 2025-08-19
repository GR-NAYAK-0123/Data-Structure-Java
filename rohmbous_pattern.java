import java.util.Scanner;

public class rohmbous_pattern {
    public static void rohmbous(int n){
        for(int i = n;i>=1;i--){
            // for spaces
            for(int j = 1;j<=i-1;j++){
                System.out.print(" ");
            }
            // for stars
            for(int j = 1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the size: ");
            int n = sc.nextInt();
            rohmbous(n);
        }
    }
}
