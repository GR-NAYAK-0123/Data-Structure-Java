import java.util.Scanner;

public class even_odd_using_bitmanipulation {
    public static void check(int n){
        int bitmask = 1;
        if((n & bitmask) == 1){
            System.out.println("Odd Number");
        }
        else{
            System.out.println("Even Number");
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int n;
            System.out.print("Enter a number: ");
            n = sc.nextInt();
            check(n);
        }
    }
}
