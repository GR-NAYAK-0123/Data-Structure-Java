import java.util.Scanner;

public class butterfly_pattern {
    public static void butterfly(int n){
        for(int i = 1;i<=n;i++){
            // for stars
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            // for spaces
            for(int j = 1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // Again for stars
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // for inverted
        for(int i = n;i>=1;i--){
            // for stars
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            // for spaces
            for(int j = 1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // Again for stars
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the size: ");
            int n = sc.nextInt();
            butterfly(n);
        }
    }
}
