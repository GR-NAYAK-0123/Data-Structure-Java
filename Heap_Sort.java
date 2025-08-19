// import java.util.*;

public class Heap_Sort {
    public static void heapSort(int arr[]){
        int n = arr.length;

        // First we have make a maxHeap
        for(int i = n/2;i>=0;i--){
            heapify(arr,i,n);
        }
        for(int i = n-1;i>0;i--){
            // Make a swap between first and last element then decreases the size
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            
            // Now call heapify function for that decreased size
            heapify(arr, 0, i);
        }
    }

    public static void heapify(int arr[],int i,int size){
        int left = (2*i) + 1;
        int right = (2*i) + 2;
        int maxIdx = i;

        if(left < size && arr[left] > arr[maxIdx]){
            maxIdx = left;
        }
        if(right < size && arr[right] > arr[maxIdx]){
            maxIdx = right;
        }

        if(maxIdx != i){
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(arr, maxIdx, size);
        }
    }
    public static void main(String args[]){
        int arr[] = {7,8,1,6,4,0};
        heapSort(arr);

        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
