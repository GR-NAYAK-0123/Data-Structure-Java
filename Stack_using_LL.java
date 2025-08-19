// import java.util.LinkedList;

public class Stack_using_LL {
    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Stack{
        static Node head = null;

        //isEmpty
        public static boolean isEmpty(){
            return (head == null);
        }

        //push
        public static void push(int data){
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
        }

        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int val = head.data;
            head = head.next;
            return val;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String args[]){
        //Stack s = new Stack();
        Stack.push(3);
        Stack.push(2);
        Stack.push(1);

        System.out.println(Stack.peek());
        
    }
}
