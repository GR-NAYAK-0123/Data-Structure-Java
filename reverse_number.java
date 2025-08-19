import java.util.Scanner;

public class reverse_number{
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int number = sc.nextInt();
            int lastdigit = 0;
            while(number != 0){
                lastdigit = number % 10;
                System.out.print(lastdigit + " ");
                number = number / 10;
            }
        }
    }
}