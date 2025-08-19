import java.util.Scanner;

public class inverted_star_pattern {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            for(int line = 1;line <= n;line++){
                for(int star = 1;star <= n-line+1;star++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
