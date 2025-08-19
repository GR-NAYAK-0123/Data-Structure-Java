import java.util.Scanner;

public class twice_distinct_element {
    public static Boolean check_element(int number[]){
        for(int i = 0;i<number.length;i++){
            for(int j = i+1;j<number.length;j++){
                if(number[i] == number[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the size: ");
            int n = sc.nextInt();
            int number[] = new int[n];
            for(int i = 0;i<number.length;i++){
                System.out.print("Enter element for index " + i + ":");
                number[i] = sc.nextInt();
            }
            System.out.println(check_element(number));
        }
    }
}
