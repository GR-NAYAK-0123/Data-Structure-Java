import java.util.Scanner;

public class star_pattern {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            for(int line = 1;line <= 4;line++){
                for(int star = 1;star <= line;star++){
                    System.out.print("*");
                }
                System.out.println();
            }
            sc.close();
        }
    }
}
