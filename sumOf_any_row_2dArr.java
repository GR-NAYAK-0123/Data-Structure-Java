import java.util.Scanner;

public class sumOf_any_row_2dArr {
    public static int sumOf_any_row(int matrix[][],int row){
        int sum = 0;
        for(int col = 0;col<matrix[0].length;col++){
            sum += matrix[row][col];
        }
        return sum;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int matrix[][] = new int[3][3];
          for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
              System.out.print("Element for index: " + "(" + i + "," + j + ")");
              matrix[i][j] = sc.nextInt();
            }
          }
          System.out.print("Enter the row (row always < n): ");
          int row = sc.nextInt();
          System.out.println("The sum value is " + sumOf_any_row(matrix,row));
        }
    }
}
