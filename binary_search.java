import java.util.Scanner;

public class binary_search {
    public static int binarySearch(int number[],int key){
        int start = 0;
        int end = number.length  - 1;
        int mid;
        while(start <= end){
            mid = (start + end)/2;
            if(number[mid] == key){
                return mid;
            }
            else if(number[mid] > key){
                end = mid-1;
            }
            else if(number[mid] < key){
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int number[] = {1,3,5,7,8,9};
            System.out.print("Enter the element to be search: ");
            int key = sc.nextInt();
            System.out.println("The element is present at index " + binarySearch(number,key));
        }
    }
}
