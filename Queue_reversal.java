import java.util.*;

public class Queue_reversal {
    public static void reverse(Queue<Integer> q, Queue<Integer> res){
        if(q.isEmpty()){
            return;
        }
        int top = q.remove();
        reverse(q, res);
        res.add(top);
    }
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> res = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reverse(q, res);

        while(!res.isEmpty()){
            System.out.print(res.remove() + " ");
        }
        System.out.println();
    }
}
