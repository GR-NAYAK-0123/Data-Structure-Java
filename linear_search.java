import java.util.Scanner;

public class linear_search {
    public static int linearSearch(int numbers[],int key){
        for(int i = 0;i<numbers.length;i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void printArray(int numbers[]){
        for(int i = 0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int numbers[] = new int[5];
            for(int i = 0;i<numbers.length;i++){
                System.out.print("Enter the element of index : " + (i+1));
                numbers[i] = sc.nextInt();
            }
            printArray(numbers);
            System.out.print("Enter the search element: ");
            int key = sc.nextInt();
            System.out.println("The elenent is : " + key);
            System.out.println("The element is present at index " + linearSearch(numbers,key));
        }
    }
}
