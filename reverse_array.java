import java.util.Scanner;

public class reverse_array {
    public static void reverse(int number[]){
        int first = 0;
        int last = number.length-1;
        while(first < last){
            int temp = number[first];
            number[first] = number[last];
            number[last] = temp;

            first++;
            last--;
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int number[] = {2,5,4,7,6};
            reverse(number);

            for(int i = 0;i<number.length;i++){
                System.out.print(number[i] + " ");
            }
            System.out.println();
            sc.close();
        }
    }
}
