import java.util.*;

public class Reverse_string {
    public static String reverse(String str){
        Stack<Character> s = new Stack<>();

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            s.push(ch);
        }

        String ans = "";
        while(!s.isEmpty()){
            ans+=s.pop();
        }

        return ans;
    }
    public static void main(String args[]){
        String str = "vssut";
        System.out.println(reverse(str));
    }
}
