import java.util.*;

public class Greatest_number{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a > b){
            if(a > c){
                System.out.println("a is greatest number");
            }
            else{
                System.out.println("c is greatest number");
            }
        }
        else if(b > c){
                System.out.println("b is greatest number");
            }
        else{
            System.out.println("c is greatest number");
        }
            sc.close();
        }
    }
