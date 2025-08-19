// import java.util.*;

public class Queue_using_linkedlist {
    static class Node{
        int data;
        Node next;

        Node(int data){
        this.data = data;
        this.next = null;
        }
    }
    
    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null;
        }

        //add
        public static void add(int data){
            Node temp = new Node(data);
            if(isEmpty()){
                head = tail = temp;
            }

            tail.next = temp;
            tail = temp;
        }

        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int val = head.data;
            head = head.next;
            return val;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
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
