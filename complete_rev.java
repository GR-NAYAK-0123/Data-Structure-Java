import java.util.Scanner;

public class complete_rev{
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int number = sc.nextInt();
            int rev = 0;
            while(number > 0){
                int lastdigit = number % 10;
                rev = (rev * 10) + lastdigit;
                number = number / 10;
            }
            System.out.println(rev);
        }
    }
}