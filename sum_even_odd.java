import java.util.Scanner;

public class sum_even_odd {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int number;
            int choice;
            int sumEven = 0;
            int sumOdd = 0;

            do{
                System.out.print("Enter number: ");
                number = sc.nextInt();

                if(number % 2 == 0){
                    sumEven = sumEven + number;
                }
                else{
                    sumOdd = sumOdd + number;
                }

                System.out.print("Do you want to continue? 1 for yes and 0 for no: ");
                choice = sc.nextInt();
            }while(choice == 1);

            System.out.println("Sum of even number is: " + sumEven);
            System.out.println("Sum of odd number is: " + sumOdd);
        }
    }
}
