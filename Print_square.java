import java.util.Scanner;

public class Print_square{
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            for(int line = 0;line<4;line++){
                System.out.println("* * * *");
            }
            sc.close();
        }
    }
}