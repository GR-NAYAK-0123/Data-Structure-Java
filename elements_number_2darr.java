import java.util.Scanner;

public class elements_number_2darr {
    public static void searchElementsNo(int matrix[][],int key){
        int elementNo = key;
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    elementNo++;
                }
            }
        }
        if(elementNo == key){
            System.out.println("Element is not present");
        }
        else{
            System.out.println("The element is present " + (elementNo-key) + " times");
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int matrix[][] = new int[4][5];
            // input
            for(int i = 0;i<matrix.length;i++){
                for(int j = 0;j<matrix[0].length;j++){
                    System.out.print("Enter element for index " + "(" + i + "," + j + ")");
                    matrix[i][j] = sc.nextInt();
                }
            }
            System.out.print("Enter the element ");
            int key = sc.nextInt();
            searchElementsNo(matrix,key);
        }
    }
}
