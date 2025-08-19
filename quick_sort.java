import java.util.Scanner;

public class quick_sort {
    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si-1;
        for(int j = si;j<ei;j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }
    public static void quickSort(int arr[],int si,int ei){
        if(si >= ei){
            return;
        }
        int pidx = partition(arr,si,ei);
        quickSort(arr, si, pidx-1);
        quickSort(arr, pidx+1, ei);
    }
    public static void print(int arr[],int idx){
        if(idx == arr.length){
            return;
        }
        System.out.print(arr[idx] + " ");
        print(arr, idx + 1);
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int arr[] = {4,5,1,3,8,2,9,7};
            print(arr, 0);
            quickSort(arr, 0, arr.length-1);
            System.out.println();
            print(arr, 0);
            sc.close();
        }
    }
}
