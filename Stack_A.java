import java.util.ArrayList;

public class Stack_A {

    static class Stack{
        static ArrayList<Integer>list = new ArrayList<>();

        // isEmpty
        public static boolean isEmpty(){
            return (list.size() == 0);
        }

        //push
        public static void push(int data){
            list.add(data);
        }

        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int val = list.get(list.size()-1);
            list.remove(list.size()-1);
            return val;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }

    public static void main(String args[]){
        //Stack s = new Stack();
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);

        System.out.println(Stack.peek());

        while(!Stack.isEmpty()){
            System.out.println(Stack.peek());
            Stack.pop();
        }
    }
}
