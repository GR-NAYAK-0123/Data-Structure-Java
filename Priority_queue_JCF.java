import java.util.*;

public class Priority_queue_JCF {
    public static void main(String args[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(5);
        pq.add(3);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()){
            System.out.println(pq.remove());
        }
    }
}
