import java.util.Scanner;

public class sort_array_of_string {
    public static void mergeSort(String arr[],int si,int mid,int ei){
        int i = si;
        int j = mid+1;
        int k = 0;
        String temp[] = new String[(ei - si) + 1];
        while(i <= mid && j <= ei){
            if(arr[i].compareTo(arr[j]) < 0){
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

        for(int l = 0,m = si;l<temp.length;l++,m++){
            arr[m] = temp[l];
        }
    }
    public static void sort(String arr[],int si,int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si)/2;
        sort(arr, si, mid);
        sort(arr, mid+1, ei);
        mergeSort(arr,si,mid,ei);
    }
    public static void print(String arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            String arr[] = {"raja","sukumar","priya","anurag","anurah"};
            sort(arr, 0, arr.length-1);
            print(arr);
            sc.close();
        }
    }
}
