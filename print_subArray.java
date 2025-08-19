import java.util.Scanner;

public class print_subArray {
    public static void subArray(int number[]){
        for(int i = 0;i<number.length;i++){
            for(int j = i;j<number.length;j++){
                for(int k = i;k<=j;k++){
                    System.out.print(number[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int number[] = {1,2,5,6,7};
            subArray(number);
            sc.close();
        }
    }
}
