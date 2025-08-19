import java.util.Scanner;

public class search_sorted_2dMatrix {
    public static void search_sorted(int matrix[][],int key){
        // method - 1
        // int row = 0,col = matrix[0].length-1;
        // int cell = matrix[row][col];
        // while(row <= matrix.length-1 && col >= 0){
        //     if(key == matrix[row][col]){
        //         System.out.println("The element is present at " + "(" + row + "," + col + ")");
        //         return;
        //     }
        //     else if(key > matrix[row][col]){
        //         row++;
        //     }
        //     else if(key < matrix[row][col]){
        //         col--;
        //     }
        // }
        // System.out.println("The element is not present");
        
        // method - 2
        int row = matrix.length-1,col = 0;

        while(row >= 0 && col <= matrix[0].length){
            if(key == matrix[row][col]){
                System.out.println("The element is present at " + "(" + row + "," + col + ")");
                return;
            }
            else if (key > matrix[row][col]){
                col++;
            }
            else if(key < matrix[row][col]){
                row--;
            }
        }
        System.out.println("The element is not present");
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int matrix[][] = new int[4][4];
          for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
              System.out.print("Element for index: " + "(" + i + "," + j + ")");
              matrix[i][j] = sc.nextInt();
            }
          }
          System.out.print("Enter the search element: ");
          int key = sc.nextInt();
          search_sorted(matrix,key);
        }
    }
}
