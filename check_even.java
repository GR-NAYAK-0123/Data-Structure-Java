import java.util.Scanner;

public class check_even {
    public static boolean isEven(int n){
        if(n % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            boolean even = isEven(n);
            if(even == true){
                System.out.println("Number is even");
            }
            else{
                System.out.println("Number is odd");
            }
        }
    }
}
