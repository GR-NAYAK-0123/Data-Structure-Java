import java.util.Scanner;

public class update_ith_bit {
    public static int clearithbit(int num,int i){
        int bitmask = ~(1<<i);
        return num & bitmask;
    }

    public static int updateIthbit(int num,int i,int update){
        num = clearithbit(num,i);
        int bitmask = update<<i;
        return num | bitmask;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the num: ");
            int num = sc.nextInt();
            System.out.print("Enter i: ");
            int i = sc.nextInt();
            System.out.print("Enter update num: ");
            int update = sc.nextInt();
            System.out.println("The new number is " + updateIthbit(num,i,update));
        }
    }
}
