import java.util.Scanner;

public class sum_of_interger {
    public static int sumInteger(int n){
        int sum = 0;
        while(n > 0){
            int lastdigit = n % 10;
            sum = sum + lastdigit;
            n = n / 10;
        }
        return sum;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            int sumofInteger = sumInteger(n);
            System.out.println("The sum value of the integer is: " + sumofInteger);
        }
    }
}
