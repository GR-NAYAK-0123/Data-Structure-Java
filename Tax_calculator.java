import java.util.Scanner;

public class Tax_calculator{
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int income = sc.nextInt();
            int tax = 0;
            if(income <= 500000){
                tax = (int)(income * 0.0);
            }
            else if(income > 500000 && income <= 1000000){
                tax = (int)(income * 0.2);
            }
            else if(income > 1000000){
                tax = (int)(income * 0.3);
            }
            System.out.println("Tax is "+ tax);
        }
    }
}