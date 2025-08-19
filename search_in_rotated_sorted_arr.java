import java.util.Scanner;

public class search_in_rotated_sorted_arr {
    public static int search(int arr[],int target,int si,int ei){
        // base case
        if(si > ei){
            return -1;
        }
        int mid = si + (ei-si)/2;

        if(arr[mid] == target){
            return mid;
        }
        // case -> Line 1
        if(arr[si] <= arr[mid]){
            // case 1 - left:
            if(arr[si] <= target && target <= arr[mid]){
                return search(arr, target, si, mid-1);
            }
            else{
                // case 1 - right:
                return search(arr, target, mid+1, ei);
            }
        }

        // case -> Line 2
        else{
            // case 2 - right:
            if(arr[mid] <= target && target <= arr[ei]){
                return search(arr, target, mid+1, ei);
            }
            else{
                // case 2 - left:
                return search(arr, target, si, mid-1);
            }
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int arr[] = {4,5,6,7,0,1,2};
            int target = 2;
            int idx = search(arr, target, 0, arr.length-1);
            System.out.println(idx);
            sc.close();
        }
    }
}
