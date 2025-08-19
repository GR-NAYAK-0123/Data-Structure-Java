import java.util.Scanner;

public class tower_hanoi_recurssion {
    public static void towerOfHanoi(int n,String src,String helper,String dest){
        if(n == 1){
            System.out.println("Transfer" + n + "From" + src + "to" + dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer" + n + "From" + src + "to" + dest);
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int n = 3;
            towerOfHanoi(n, "S","H","D");
            sc.close();
        }
    }
}
