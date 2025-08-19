import java.util.*;

public class Connect_N_ropes {
    public static void main(String args[]){
        int ropes[] = {4,3,2,6};

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0;i<ropes.length;i++){
            pq.add(ropes[i]);
        }
        int totalVal = 0;
        while(!pq.isEmpty()){
            int sum = pq.remove() + pq.remove();
            totalVal += (sum);
            if(pq.isEmpty()){
                break;
            }
            pq.add(sum);
        }

        System.out.println("The total minimum cost is : " + totalVal);
    }
}
