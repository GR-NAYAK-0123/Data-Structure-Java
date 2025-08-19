import java.util.Scanner;

public class smallest_number {
    public static int smallest(int number[]){
        int small = Integer.MAX_VALUE;
        for(int i = 0;i<number.length;i++){
            if(number[i] < small){
                small = number[i];
            }
        }
        return small;
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
                System.out.print("Element for index " + (i+1));
                number[i] = sc.nextInt();
            }
            printArray(number);
            System.out.println("The smallest element in the array is " + smallest(number));
        }
    }
}
