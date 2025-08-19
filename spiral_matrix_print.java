import java.util.Scanner;

public class spiral_matrix_print {
    public static void printSpiral(int matrix[][]){
        int startrow = 0;
        int endrow = matrix.length-1;
        int startcol = 0;
        int endcol = matrix[0].length-1;

        while(startrow <= endrow && startcol <= endcol){
            // top
            for(int i = startcol;i<=endcol;i++){
                System.out.print(matrix[startrow][i] + " ");
            }

            // right
            for(int i = startrow + 1;i<=endrow;i++){
                System.out.print(matrix[i][endcol] + " ");
            }

            // bottom
            for(int i = endcol-1;i>=startcol;i--){
                if(startrow == endrow){
                    break;
                }
                System.out.print(matrix[endrow][i] + " ");
            }

            // left
            for(int i = endrow-1;i>=startrow+1;i--){
                if(startcol == endcol){
                    break;
                }
                System.out.print(matrix[i][startcol] + " ");
            }
            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int matrix[][] = new int [5][5];
            for(int i = 0;i<matrix.length;i++){
                for(int j = 0;j<matrix[0].length;j++){
                    System.out.print("Enter element for " + "(" + i + "," + j + ")"); 
                    matrix[i][j] = sc.nextInt();
                }
            }
            printSpiral(matrix);
        }
    }
}
