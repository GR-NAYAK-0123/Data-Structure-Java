import java.util.Scanner;

public class bin_decimal {
    public static void binTodec(int n){
        int binNo = n;
        int dec = 0;
        int pow = 0;
        while(n > 0){
            int lastdigit = n % 10;
            dec = dec + (lastdigit * (int)Math.pow(2,pow));
            pow++;
            n = n / 10;
        }
        System.out.println("The decimal value of " + binNo + " is: " + dec);
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the binary number: ");
            int n = sc.nextInt();
            binTodec(n);
        }
    }
}
