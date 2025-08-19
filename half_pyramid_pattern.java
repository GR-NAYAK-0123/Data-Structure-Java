import java.util.Scanner;

public class half_pyramid_pattern {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            for(int line = 1;line <= n;line++){
                for(int number = 1;number <= line ;number++){
                    System.out.print(number);
                }
                System.out.println();
            }
        }
    }
}
