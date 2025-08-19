import java.util.Scanner;

public class string_subset_backtack {
    public static void findSubset(String str,String ans,int i){
        //base case
        if(i == str.length()){
            if(ans == ""){
                System.out.println("Null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }

        //yes
        findSubset(str, ans + str.charAt(i), i+1);

        //No
        findSubset(str, ans, i+1);
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            String str = "abc";
            findSubset(str, "", 0);
            sc.close();
        }
    }
}
