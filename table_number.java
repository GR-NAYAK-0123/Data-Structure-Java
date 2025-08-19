import java.util.Scanner;

public class table_number {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int i = 1;

            while(i <= 10){
                System.out.print(i*n + " ");
                i++;
            }
        }
    }
}
