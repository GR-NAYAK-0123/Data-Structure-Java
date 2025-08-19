import java.util.Scanner;

public class set_ith_bit {
    public static int setIthbit(int num,int i){
        int bitmask = 1<<i;
        return num | bitmask;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the num: ");
            int num = sc.nextInt();
            System.out.print("Enter i: ");
            int i = sc.nextInt();
            System.out.println("The new number is " + setIthbit(num,i));
        }
    }
}
