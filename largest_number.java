import java.util.Scanner;

public class largest_number {
    public static int largest(int number[]){
        int large = Integer.MIN_VALUE;
        for(int i = 0;i<number.length;i++){
            if(number[i] > large){
                large = number[i];
            }
        }
        return large;
    }
    public static void printArray(int number[]){
        for(int i = 0;i<number.length;i++){
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int number[] = new int[5];
            for(int i = 0;i<number.length;i++){
                System.out.print("Enter the element of index " + (i+1));
                number[i] = sc.nextInt();
            }
            printArray(number);
            System.out.println("The largest in the array is " + largest(number));
        }
    }
}
