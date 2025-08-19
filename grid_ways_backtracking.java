import java.util.Scanner;

public class grid_ways_backtracking {
    public static int gridWays(int i,int j,int n,int m){
        //base case
        if(i == n-1 && j == m-1){
            return 1;
        }
        else if(i == n || j == m){
            return 0;
        }
        // recurssion
        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);

        return w1 + w2;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int n = 3;
            int m = 3;
            System.out.println("The number of ways is: " + gridWays(0, 0, n, m));
            sc.close();
        }
    }
}
