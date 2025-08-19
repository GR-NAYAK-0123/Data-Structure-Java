import java.util.*;

public class Duplicate_parentheses {
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            int count = 0;
            if(ch == ')'){
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true;
                }
                else{
                    s.pop();
                }
            } else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String args[]){
        //String str = "(a+b)";
        String str1 = "((a+b))";
        System.out.println(isValid(str1));
    }
}
