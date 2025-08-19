import java.util.Scanner;

public class rotated_halfPyramid_number {
    public static void rotated_half_pyr(int n){
        for(int i = 1;i<=n;i++){
            // for numbers
            for(int j = 1;j<=n-i+1;j++){
                System.out.print(j);
            }
            // for spaces
            for(int j = 1;j<=n-(n-i+1);j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of line: ");
            int n = sc.nextInt();
            rotated_half_pyr(n);
        }
    }
}
