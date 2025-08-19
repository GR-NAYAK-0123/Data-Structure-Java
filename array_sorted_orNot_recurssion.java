import java.util.Scanner;

public class array_sorted_orNot_recurssion {
    public static boolean isSorted(int arr[],int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int arr[] = {5,7};
            if(isSorted(arr,0)){
                System.out.println("Array is sorted");
            }
            else{
                System.out.println("Array is not sorted");
            }
            sc.close();
        }
    }
}
