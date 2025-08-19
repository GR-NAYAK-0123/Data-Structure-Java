import java.util.*;

public class Nearby_Cars {
    static class Car implements Comparable<Car>{
        int idx;
        int distance;

        public Car(int idx,int distance){
            this.idx = idx;
            this.distance = distance;
        }
        @Override
        public int compareTo(Car c2){
            return this.distance - c2.distance;
        }
    }
    public static void main(String args[]){
        int arr[][] = {{3,3},{5,-1},{-2,4}};
        int k = 2;
        PriorityQueue<Car> c = new PriorityQueue<>();

        for(int i = 0;i<arr.length;i++){
            int distance = (arr[i][0] * arr[i][0]) + (arr[i][1] * arr[i][1]);
            c.add(new Car(i, distance));
        }

        while(k != 0){
            System.out.println("C" + c.peek().idx);
            c.remove();
            k--;
        }
    }
}
