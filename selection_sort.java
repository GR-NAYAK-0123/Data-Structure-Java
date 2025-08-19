import java.util.Scanner;

public class selection_sort {
    public static void selectionSort(int arr[]){
        for(int turn = 0;turn<arr.length-1;turn++){
            int min = turn;
            for(int i = turn+1;i<arr.length;i++){
                if(arr[min] > arr[i]){
                    min = i;
                }
            }
            int temp = arr[turn];
            arr[turn] = arr[min];
            arr[min] = temp;
        }
    }
    public static void printArr(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int arr[] = {4,7,1,8,3};
            selectionSort(arr);
            printArr(arr);
            sc.close();
        }
    }
}
