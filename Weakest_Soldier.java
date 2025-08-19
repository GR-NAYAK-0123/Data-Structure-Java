import java.util.*;

public class Weakest_Soldier {
    static class Soldier implements Comparable<Soldier>{
        int number;
        int idx;

        public Soldier(int number,int idx){
            this.number = number;
            this.idx = idx;
        }

        @Override
        public int compareTo(Soldier s2){
            if(this.number == s2.number){
                return this.idx - s2.idx;
            }
            return this.number - s2.number;
        }
    }
    public static void main(String args[]){
        int matrix[][] = {{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
        int k = 2;

        PriorityQueue<Soldier> pq = new PriorityQueue<>();

        for(int i = 0;i<matrix.length;i++){
            int sum = 0;
            for(int j = 0;j<matrix[i].length;j++){
                sum += matrix[i][j];
            }
            pq.add(new Soldier(sum, i));
        }

        while(k != 0){
            System.out.println("Row - " + pq.peek().idx);
            pq.remove();
            k--;
        }
    }
}
