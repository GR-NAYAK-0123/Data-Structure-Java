import java.util.*;

public class First_nonRepeat_char {
    public static char nonRepeatChar(String str, int freq[], Queue<Character> q,int idx){
        char ch = str.charAt(idx);
        freq[ch - 'a']++;
        q.add(ch);
        while(!q.isEmpty() && freq[q.peek() - 'a'] >= 2){
            q.remove();
        }
        if(q.isEmpty()){
            return '@';
        }
        return q.peek();
    }
    public static void main(String args[]){
        String str = "aabccxb";
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();
        for(int i = 0;i<str.length();i++){
            char res = nonRepeatChar(str, freq, q, i);
            System.out.print(res + " ");
        }
    }
}
