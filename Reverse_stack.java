import java.util.*;

public class Reverse_stack {
    public static void pushBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int val = s.pop();
        pushBottom(s, data);
        s.push(val);
    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int val = s.pop();
        reverse(s);
        pushBottom(s,val);
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        //pushBottom(s, 5);


        // while(!s.isEmpty()){
        //     System.out.print(s.pop() + " ");
        // }
        // System.out.println();

         reverse(s);

        while(!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }
        System.out.println();
    }
}
