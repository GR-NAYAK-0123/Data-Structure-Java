import java.util.Scanner;

public class strong_number {
    public static int fact(int n){
        int fact = 1;
        for(int i = 1;i<=n;i++){
            fact = fact * i;
        }
        return fact;
    }

    public static void strong(int n){
        int number = n;
        int sumFact = 0;
        while(n > 0){
            int lastdigit = n % 10;
            int factorial = fact(lastdigit);
            sumFact = sumFact + factorial;
            n = n / 10;
        }
        if(number == sumFact){
            System.out.println("It is a strong number");
        }
        else{
            System.out.println("It is not a strong number");
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            strong(n);
        }
    }
}
