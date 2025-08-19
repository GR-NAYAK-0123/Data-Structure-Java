import java.util.*;

public class Heap {
    static class Max{
        List<Integer> list = new ArrayList<>();

        public void add(int data){
            list.add(data);

            int child = list.size()-1;
            int par = (child-1)/2;

            while(list.get(child) > list.get(par)){
                int temp = list.get(child);
                list.set(child,list.get(par));
                list.set(par,temp);

                child = par;
                par = (child-1)/2;
            }
        }

        public int peek(){
            return list.get(0);
        }

        private void heapify(int idx){
            int left = (2 * idx) + 1;
            int right = (2 * idx) + 2;
            int maxIdx = idx;

            if(left < list.size() && list.get(left) > list.get(maxIdx)){
                maxIdx = left;
            }
            if(right < list.size() && list.get(right) > list.get(maxIdx)){
                maxIdx = right;
            }

            if(maxIdx != idx){
                int temp = list.get(idx);
                list.set(idx,list.get(maxIdx));
                list.set(maxIdx,temp);
                heapify(maxIdx);
            }
        }

        public void remove(){
            int temp = list.get(0);
            list.set(0,list.get(list.size()-1));
            list.set(list.size()-1,temp);

            list.remove(list.size()-1);
            heapify(0);
        }

        public boolean isEmpty(){
            return list.size() == 0;
        }
    }
    static class Min{
        List<Integer> list = new ArrayList<>();

        public void add(int data){
            list.add(data);

            int child = list.size()-1;
            int par = (child-1)/2;

            while(list.get(child) < list.get(par)){
                int temp = list.get(child);
                list.set(child,list.get(par));
                list.set(par,temp);

                child = par;
                par = (child-1)/2;
            }
        }

        public int peek(){
            return list.get(0);
        }

        private void heapify(int idx){
            int left = (2 * idx) + 1;
            int right = (2 * idx) + 2;
            int minIdx = idx;

            if(left < list.size() && list.get(left) < list.get(minIdx)){
               minIdx = left;
            }
            if(right < list.size() && list.get(right) < list.get(minIdx)){
               minIdx = right;
            }

            if(minIdx != idx){
                int temp = list.get(idx);
                list.set(idx,list.get(minIdx));
                list.set(minIdx,temp);
                heapify(minIdx);
            }
        }

        public void remove(){
            int temp = list.get(0);
            list.set(0,list.get(list.size()-1));
            list.set(list.size()-1,temp);

            list.remove(list.size()-1);
            heapify(0);
        }

        public boolean isEmpty(){
            return list.size() == 0;
        }
    }
    public static void main(String args[]){
        //Min pq = new Min();
        Max pq = new Max();

        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);
        pq.add(5);
        pq.add(0);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
