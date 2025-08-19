import java.util.Scanner;

public class hollow_rectangle {
    public static void hollow_rect(int totrows,int totcols){
        for(int i = 1;i<=totrows;i++){
            for(int j = 1;j<=totcols;j++){
                if(i == 1 || i == totrows || j == 1 || j == totcols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter number of row: ");
            int r = sc.nextInt();
            System.out.print("Enter nnumber of column: ");
            int c = sc.nextInt();
            hollow_rect(r,c);
        }
    }
}
