import java.util.Scanner;

public class sub_string {
    public static String substring(String str,int si,int ei){
        String newstr = "";
        for(int i = si;i<ei;i++){
            newstr += str.charAt(i);
        }
        return newstr;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            String str = "HelloWorld";
            //System.out.println(substring(str,0,4));
            System.out.println(str.substring(3,7));
            sc.close();
        }
    }
}
