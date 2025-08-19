import java.util.Scanner;

public class zero_one_triangle{
    public static void zero_oneTriangle(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                if((j+i) % 2 == 0){
                    System.out.print(1 + " ");
                }
                else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of lines: ");
            int n = sc.nextInt();
            zero_oneTriangle(n);
        }
    }
}