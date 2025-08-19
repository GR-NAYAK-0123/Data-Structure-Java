import java.util.Scanner;

public class last_occ_recurssion {
    
    // Raja lagic
    public static int lastOcc(int arr[],int i,int key){
        if(i < 1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return lastOcc(arr,i-1,key);
    }

    // Course logic
    public static int lastOccurance(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurance(arr,key,i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int arr[] = {3,2,6,9,8,0,1,0};
            int key = 3;
            System.out.println(lastOccurance(arr,key,0));
            sc.close();
        }
    }
}
