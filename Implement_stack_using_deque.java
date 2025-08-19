import java.util.*;

public class Implement_stack_using_deque {
    static class Stack{
        Deque<Integer> deque = new LinkedList<>();

        public boolean isEmpty(){
            return deque.isEmpty();
        }

        public void push(int data){
            deque.addLast(data);
        }

        public int pop(){
            return deque.removeLast();
        }

        public int peek(){
            return deque.getLast();
        }
    }
    public static void main(String args[]){
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(4);

        System.out.println("Peek element is " + s.peek());

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
