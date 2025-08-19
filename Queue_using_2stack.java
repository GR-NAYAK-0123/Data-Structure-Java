import java.util.*;

public class Queue_using_2stack {
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        //add
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        //remove
        public static int remove(){
            if(s1.isEmpty()){
                return -1;
            }
            return s1.pop();
        }

        //peek
        public static int peek(){
            if(s1.isEmpty()){
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String args[]){
        //Queue q = new Queue();

        Queue.add(1);
        Queue.add(2);
        Queue.add(3);

        while(!Queue.isEmpty()){
            System.out.print(Queue.remove() + " ");
        }
    }
}
