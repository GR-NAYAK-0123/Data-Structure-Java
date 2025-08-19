import java.util.Scanner;

public class print_pairs {
    public static void pairs(int number[]){
        for(int i = 0;i<number.length;i++){
            int curr = number[i];
            for(int j = i+1;j<number.length;j++){
                System.out.print("(" + curr + "," + number[j] + ") ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int number[] = {1,3,5,6,7};
            pairs(number);
            sc.close();
        }
    }
}
