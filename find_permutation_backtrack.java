import java.util.Scanner;

public class find_permutation_backtrack {
    public static void permutation(String str,String ans){
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        //recurssion
        for(int i = 0;i<str.length();i++){
            char curr = str.charAt(i);
            String newstr = str.substring(0,i) + str.substring(i+1);
            permutation(newstr, ans + curr);
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            String str = "abc";
            permutation(str, "");
            sc.close();
        }
    }
}
