import java.util.Scanner;

public class count_set_bits {
    public static int countSetbits(int num){
        int count = 0;

        while(num != 0){
            int bitmask = num & 1;
            if(bitmask == 1){
                count++;
            }
            num = num>>1;
        }
        return count;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the num: ");
            int num = sc.nextInt();
            System.out.println("The number of set bits are: " + countSetbits(num));
        }
    }
}
