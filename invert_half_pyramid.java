import java.util.Scanner;

public class invert_half_pyramid {
    public static void inverted_pyramid(int n){
        for(int i = 1;i<=n;i++){
            // for space
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            // for stars
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of row: ");
            int r = sc.nextInt();
            inverted_pyramid(r);
        }
    }
}
