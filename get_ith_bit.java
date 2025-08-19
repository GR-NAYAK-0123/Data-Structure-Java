import java.util.Scanner;

public class get_ith_bit {
    public static int getIthbit(int num,int i){
        int bitmask = num & 1<<i;
        if(bitmask == 0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter num: ");
            int num = sc.nextInt();
            System.out.print("Enter i = ");
            int i = sc.nextInt();
            System.out.println("The Ith bit is: " + getIthbit(num,i));
        }
    }
}
