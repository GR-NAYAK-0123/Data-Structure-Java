import java.util.Scanner;

public class palindrome_number {
    public static int isPalindrome(int n){
        int number = n;
        int reverse = 0;
        while(n > 0){
            int lastdigit = n % 10;
            reverse = (reverse * 10) + lastdigit;
            n = n / 10;
        }

        if(reverse == number){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            int palindrome = isPalindrome(n);
            if(palindrome == 1){
                System.out.println("It is a palindrome number");
            }
            else{
                System.out.println("It is not a palindrome number");
            }
        }
    }
}
