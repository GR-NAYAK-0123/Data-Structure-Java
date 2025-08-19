import java.util.Scanner;

public class decimal_binary {
    public static void decTobin(int n){
        int binary = 0;
        int pow = 0;
        while(n > 0){
            int remainder = n % 2;
            binary = binary + (remainder * (int)Math.pow(10,pow));
            pow++;
            n = n / 2;
        }
        System.out.println("The binary form is: " + binary);
    }
    public static  void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the decimal number: ");
            int n = sc.nextInt();
            decTobin(n);
        }
    }
}
