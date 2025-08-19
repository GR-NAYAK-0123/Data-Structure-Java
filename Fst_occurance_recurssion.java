import java.util.Scanner;

public class Fst_occurance_recurssion {
    public static int firstOcc(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOcc(arr,key,i+1);
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int arr[] = {3,1,7,3,9,4,2,7,1};
            int key = 7;
            System.out.println(firstOcc(arr,key,0));
            sc.close();
        }
    }
}
