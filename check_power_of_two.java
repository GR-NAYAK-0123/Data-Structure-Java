import java.util.Scanner;

public class check_power_of_two {
    public static boolean check_power_two(int num){
        if(num == 0){
            return false;
        }
        int bitmask = num & (num-1);
        if(bitmask == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the num: ");
            int num = sc.nextInt();
            System.out.println(check_power_two(num));
        }
    }
}
