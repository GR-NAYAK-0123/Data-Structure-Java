import java.util.Scanner;

public class diagonal_sum_2dMatrix {
    public static int diagonalSum(int matrix[][]){
        int sum = 0;

        // left top to right bottom diagonal
        for(int i = 0, j = 0;i<matrix.length && j<matrix[0].length;i++,j++){
            sum += matrix[i][j];
        }
        
        // left bottom to right top diagonal
        for(int i = matrix.length-1,j = 0;i>=0 && j<matrix[0].length;i--,j++){
            if(i == j){
                continue;
            }
            sum += matrix[i][j];
        }
        return sum;
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
          System.out.println("The diagonal sum of the matrix is " + diagonalSum(matrix));
        }
    }
}
