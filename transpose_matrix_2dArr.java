import java.util.Scanner;

public class transpose_matrix_2dArr {
  public static void transpose(int matrix[][]){
    int row = matrix.length-1;
    int col = matrix[0].length-1;
    int transpose[][] = new int[col+1][row+1];

    for(int i = 0;i<transpose.length;i++){
      for(int j = 0;j<transpose[0].length;j++){
        transpose[i][j] = matrix[j][i];
      }
    }
    print(transpose);
  }
    public static void print(int matrix[][]){
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int matrix[][] = new int[2][3];
          for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
              System.out.print("Element for index: " + "(" + i + "," + j + ")");
              matrix[i][j] = sc.nextInt();
            }
          }
          print(matrix);
          transpose(matrix);
          // int row = matrix[0].length - 1;
          // int col = matrix.length - 1;
          // int transpose[][] = new int[row+1][col+1];
          // for(int i = 0;i<=row;i++){
          //   for(int j = 0;j<=col;j++){
          //       transpose[i][j] = matrix[j][i];
          //   }
          // }
          // print(transpose);
        }
    }
}
