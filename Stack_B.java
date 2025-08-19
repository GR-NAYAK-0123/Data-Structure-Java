import java.util.*;

public class Stack_B {
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(5);

        //System.out.println(s.peek());
        while(!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }
    }
}
