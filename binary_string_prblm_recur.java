import java.util.Scanner;

public class binary_string_prblm_recur {
    public static void binaryString(int n,int last,String str){
        if(n == 0){
            System.out.println(str);
            return;
        }
        if(last == 0){
            binaryString(n-1,0, str +"0");
            binaryString(n-1, 1, str+"1");
        }
        else{
            binaryString(n-1, 0, str +"0");
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            binaryString(3, 0, "");
            sc.close();
        }
    }
}
