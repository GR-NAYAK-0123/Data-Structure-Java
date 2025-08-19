import java.util.Scanner;

public class remove_dupl_str_recurssion {
    public static boolean map[] = new boolean[26];
    public static void removeDuplicate(String str,int i,StringBuilder newstr){
        if(i == str.length()){
            System.out.println(newstr);
            return;
        }

        char ch = str.charAt(i);
        if(map[ch - 'a'] == true){
            removeDuplicate(str, i+1, newstr);
        }
        else{
            map[ch - 'a'] = true;
            removeDuplicate(str, i+1, newstr.append(ch));
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            String str = "appnnacollege";
            removeDuplicate(str, 0, new StringBuilder(""));
            sc.close();
        }
    }
}
