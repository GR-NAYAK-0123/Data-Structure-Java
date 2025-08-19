import java.util.Scanner;

public class merge_sort {
    public static void merge(int arr[],int si,int mid,int ei){
        int i = si;
        int j = mid+1;
        int k = 0;
        int temp[] = new int[(ei-si)+1];
        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;k++;
            }
            else{
                temp[k] = arr[j];
                j++;k++;
            }
        }
        while(i <= mid){
            temp[k] = arr[i];
            i++;k++;
        }
        while(j <= ei){
            temp[k] = arr[j];
            j++;k++;
        }
        for(int x = 0, y = si;x<temp.length;x++,y++){
            arr[y] = temp[x];
        }
    }
    public static void mergeSort(int arr[],int si,int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }
    public static void print(int arr[],int idx){
        if(idx == arr.length){
            return;
        }
        System.out.print(arr[idx] + " ");
        print(arr, idx+1);
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int arr[] = {4,2,7,1,8,3,9,5};
            System.out.print("Before sorting: ");
            print(arr, 0);
            System.out.println();
            System.out.print("After sorting: ");
            mergeSort(arr, 0, arr.length-1);
            print(arr, 0);
            sc.close();
        }
    }
}
