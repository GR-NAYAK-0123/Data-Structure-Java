import java.util.Scanner;

public class nQueens {
    static int count = 0;
    public static boolean isSafe(char board[][],int row,int col){
        // vertically up
        for(int i = row-1;i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // diagonally right up
        for(int i = row-1,j = col+1;i>=0 && j <board[0].length;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // diagonally left up
        for(int i = row-1,j = col-1;i>=0 && j >= 0;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static void nQueen(char board[][],int row){
        if(row == board.length){
            //print(board);
            count++;
            return;
        }
        for(int j = 0;j<board[0].length;j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                nQueen(board, row+1);
                board[row][j] = 'x';
            }
        }
    }
    public static void print(char board[][]){
        System.out.println("----------Chess board----------");
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int n = 1;
            char board[][] = new char[n][n];

            //Initialisation
            for(int i = 0;i<board.length;i++){
                for(int j = 0;j<board[0].length;j++){
                    board[i][j] = 'x';
                }
            }
            nQueen(board, 0);
            System.out.println("The number of ways is " + count);
            sc.close();
        }
    }
}
