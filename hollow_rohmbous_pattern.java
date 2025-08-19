import java.util.Scanner;

public class hollow_rohmbous_pattern {
    public static void hollow_rohmbous(int n){
        for(int i = 1;i<=n;i++){
            // for spaces
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            // for stars
            for(int j = 1;j<=n;j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the size: ");
            int n = sc.nextInt();
            hollow_rohmbous(n);
        }
    }
}
