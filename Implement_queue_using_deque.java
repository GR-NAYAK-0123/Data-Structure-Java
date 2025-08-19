import java.util.*;

public class Implement_queue_using_deque {
    static class Queue{
        Deque<Integer> deque = new LinkedList<>();

        public boolean isEmpty(){
            return deque.isEmpty();
        }

        public void add(int data){
            deque.addFirst(data);
        }

        public int remove(){
            return deque.removeLast();
        }

        public int peek(){
            return deque.getLast();
        }
    }
    public static void main(String args[]){
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("Peek element is : " + q.peek());

        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
        System.out.println();
    }
}
