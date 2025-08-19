import java.util.LinkedList;

public class LinkedList_jcf {
    public static void main(String args[]){
        // create
        LinkedList<Integer>ll = new LinkedList<>();

        //add 
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(0);
        ll.addLast(3);

        System.out.println(ll);


        // remove
        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
    }
}
