import java.util.Scanner;

public class bubble_sort {
    public static void bubbleSort(int arr[]){
        for(int turn = 0;turn<arr.length-1;turn++){
            for(int i = 0;i<arr.length-1-turn;i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
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
            int arr[] = {5,6,2,1,3};
            bubbleSort(arr);
            printArr(arr);
            sc.close();
        }
    }
}
