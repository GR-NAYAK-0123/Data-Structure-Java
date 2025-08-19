import java.util.Scanner;

public class swap_notUsingThird_bitMan {
    public static void swap(int x,int y){
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("x = " + x + " " + "y = " + y);
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter x: ");
            int x = sc.nextInt();
            System.out.print("Enter y: ");;
            int y = sc.nextInt();
            swap(x,y);
        }
    }
}
