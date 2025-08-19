import java.util.Scanner;

public class clear_range_bits {
    public static int clear_in_range(int num,int i,int j){
        int a = ~0<<(j+1);
        int b = (1<<i) - 1;
        int bitmask = a | b;
        return num & bitmask;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the num: ");
            int num = sc.nextInt();
            System.out.print("Enter i: ");
            int i = sc.nextInt();
            System.out.print("Enter j: ");
            int j = sc.nextInt();
            System.out.println("The new number is " + clear_in_range(num,i,j));
        }
    }
}
